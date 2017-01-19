package com.ww.framework.interceptors;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ww.framework.ParameterRequestWrapper;
import com.ww.framework.SystemSession;
import com.ww.framework.baseInfo.ConstantModel;

/**
 * 拦截用户访问URL地址做访问权限验证，并对参数格式化
 * @author Administrator
 *
 */
public class CheckUserUrlFilter implements Filter{

	protected FilterConfig filterConfig;
	
	private static ThreadLocal<HttpServletRequest> requestLocal= new ThreadLocal<HttpServletRequest>();
	
	public void init(FilterConfig arg0) throws ServletException {
		this.filterConfig = null;
	}
	
	public void destroy() {
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		req.setCharacterEncoding("UTF-8");
		ParameterRequestWrapper wrapRequest=requestFilter(req);
	    
		String strURL = wrapRequest.getRequestURL().toString();
        
        SystemSession.setRequest(wrapRequest);  
		SystemSession.setResponse((HttpServletResponse) response);
		
		Object adminUser=(Object) SystemSession.getSessionAttribute(ConstantModel.MANAGERSESSIONUSER);
        if (isUrlFilter(strURL)) {
            chain.doFilter(wrapRequest, response);
        }else if(adminUser==null){
        	ServletContext sc = filterConfig.getServletContext();
			RequestDispatcher rd = sc
					.getRequestDispatcher("/WEB-INF/jsp/dealSession.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException sx) {
				filterConfig.getServletContext().log(sx.getMessage());
			} catch (IOException iox) {
				filterConfig.getServletContext().log(iox.getMessage());
			}
        }else{
        	chain.doFilter(wrapRequest, response);
        }
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private ParameterRequestWrapper requestFilter(HttpServletRequest request) {
        HashMap<String,Object> map = new HashMap<String,Object>(request.getParameterMap());
        Set<String> key = map.keySet();
        // 去除参数值前后空格
        for (Iterator it = key.iterator(); it.hasNext();) {
            String argments = (String) it.next();
            String[] argmentsVal = request.getParameterValues(argments);
            if (argmentsVal != null && argmentsVal.length > 0) {
                String[] argmentsVal_new = new String[argmentsVal.length];
                for (int i = 0; i < argmentsVal.length; i++) {
                    String argmentsValeach = argmentsVal[i].trim();
                    if (argmentsVal[i] != null) {
                        argmentsVal_new[i] = argmentsValeach;
                    }
                }
                map.put(argments, argmentsVal_new);
            }

        }
        // 重新封装参数
        ParameterRequestWrapper wrapRequest = new ParameterRequestWrapper(request, map);
		return wrapRequest;
	}
	
	/**    
     * isUrlFilter(是否拦截url)  
     * @param name 
     * @param @return 设定文件      
     * @return String DOM对象      
     * @Exception 异常对象      
    */
    private boolean isUrlFilter(String strURL) {
        for (String url : ConstantModel.ACCESS_URL) {
            if (strURL.indexOf(url) != -1) {
                return true;
            }
        }
        return false;
    }
}
