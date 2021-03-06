package com.ww.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SystemSession {
	
	private static ThreadLocal<HttpServletRequest> requestLocal= new ThreadLocal<HttpServletRequest>();  
    private static ThreadLocal<HttpServletResponse> responseLocal= new ThreadLocal<HttpServletResponse>();
    
    public static HttpServletRequest getRequest() {  
        return (HttpServletRequest)requestLocal.get();  
    }  
    public static void setRequest(HttpServletRequest request) {  
        requestLocal.set(request);  
    }  
    public static HttpServletResponse getResponse() {  
        return (HttpServletResponse)responseLocal.get();  
    }  
    public static void setResponse(HttpServletResponse response) {  
        responseLocal.set(response);  
    }  
    public static HttpSession getSession() {  
        return (HttpSession)((HttpServletRequest)requestLocal.get()).getSession();  
    }  
    /**
     * 获得session节点
     * @param str
     * @return
     */
    public static Object getSessionAttribute(String str) {  
        Object obj=getSession().getAttribute(str);
        return obj;
    }
    
    public static void setSessionAttribute(String session_name,Object obj) {  
        getRequest().getSession().setAttribute(session_name,obj);
    }
}
