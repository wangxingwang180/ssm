package com.ww.framework.baseInfo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解  基于controller操作定义
 * @author Administrator
 *
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerDescription {
	
	/** 标题  自定义 */
	String title() default "";

	/** 访问url controller的名称 */
	String action() default "";

	/** 是否保存请求的参数 */
	boolean isSaveRequestData() default false;

	/** 渠道 自定义 可区别于其他 bean ,如service、dao */
	String channel() default "web";
}
