package com.ww.framework.handler;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听全局   Listener实现
 * @author Administrator
 *
 */
public class AppContextListener implements HttpSessionAttributeListener,
HttpSessionListener, ServletContextListener {
	
private final static Logger logger = Logger.getLogger(AppContextListener.class);

private ServletContext app=null;//用于application属性操作  

/**
* 上下文初始化,初始化入口
*/
public void contextInitialized(ServletContextEvent sce) {
this.app = sce.getServletContext();//取得servletContext实例
//初始化系统
logger.info("<----------------------系统初始化-------------------------->");
}
/**
* 增加session属性
*/
public void attributeAdded(HttpSessionBindingEvent event) {

this.app.setAttribute("key","value");// 重新保存
}

public void attributeRemoved(HttpSessionBindingEvent event) {

this.app.setAttribute("key","value");
}

public void sessionDestroyed(HttpSessionEvent event) {

}

public void attributeReplaced(HttpSessionBindingEvent arg0) {

}

public void sessionCreated(HttpSessionEvent arg0) {

}

public void contextDestroyed(ServletContextEvent arg0) {
//系统停止时记录必要数据
logger.info("<----------------------系统关闭-------------------------->");
}

}