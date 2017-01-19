package com.ww.framework.aop;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import com.ww.framework.baseInfo.ControllerDescription;

@Aspect
public class AspectJLoggerAOP {
private final Logger log = Logger.getLogger(AspectJLoggerAOP.class);
	
	@Pointcut("execution(* com.ww.controller.*.*.*.*(..))")
	public void pointcut(){
		
	}
	
	@Before(value="pointcut()")
	public void before(){
		//可记录操作人信息
		//System.out.println("test.....................");
	}
	

	// Controller层切点  基于自定义注解
	/*@Pointcut("@annotation(com.ww.framework.baseInfo.ControllerDescription)")
	public void controllerAspect() {
		
	}*/
	
	@Pointcut("execution(* com.ww.controller.*.*.*.*(..))")
	public void controllerAspect() {
		
	}

	/**
	 * 前置通知 用于拦截Controller层记录用户的操作
	 * 
	 * @param joinPoint
	 *            切点
	 */
	@AfterReturning(pointcut = "controllerAspect()")
	public void doBefore(JoinPoint joinPoint) {
		handleLog(joinPoint, null);
	}

	@AfterThrowing(value = "controllerAspect()", throwing = "e")
	public void doAfter(JoinPoint joinPoint, Exception e) {
		handleLog(joinPoint, e);
	}
    
    private void handleLog(JoinPoint joinPoint, Exception e) {
		try {
			if(e!=null){
				printErrorToFile(e);
			}
			/*//获得注解
			ControllerDescription controllerLog = giveController(joinPoint);
			if(controllerLog == null){
	            return;
	        }
	        //获取当前用户session
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	        
	        //处理设置注解上的参数
	        getControllerMethodDescription(controllerLog,request);*/
			
		} catch (Exception exp) {
			//记录本地异常日志
			printErrorToFile(exp);
		}
	}

	@SuppressWarnings("unused")
	private void getControllerMethodDescription(
			ControllerDescription controllerLog, HttpServletRequest request) {
		//设置action动作
        log.info("action="+controllerLog.action()+" ,title = "+controllerLog.title()+" ,channel="+controllerLog.channel());
        //是否需要保存request，参数和值
        if(controllerLog.isSaveRequestData())
        {
            //获取参数的信息
            setRequestValue(request);
        }
	}

	@SuppressWarnings("unchecked")
	private void setRequestValue(HttpServletRequest request) {
		Map<Object,Object> map = request.getParameterMap();
		JSONArray json = JSONArray.fromObject(map);
        String params = json.toString();
		log.error("params="+params);
	}

	@SuppressWarnings("unused")
	private ControllerDescription giveController(JoinPoint joinPoint) {
		Signature signature = (Signature) joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;  
        Method method = methodSignature.getMethod();  
        if(method != null)
        {
            return method.getAnnotation(ControllerDescription.class);
        }
        return null;
	}

	public void printErrorToFile(Throwable cause) {
        StringWriter sw = new StringWriter();
        PrintWriter pWriter = new PrintWriter(sw);
        cause.printStackTrace(pWriter);
        log.error(sw.toString());
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pWriter != null) {
                    pWriter.close();
                }
                if (sw != null) {
                    sw.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
	
}
