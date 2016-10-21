package com.yuxuan66.yxbaseframe.common.base;
/**
 * 基础异常处理类 运行时异常
 * 在此类进行如记录异常信息等操作
 * @author Sir丶雨轩
 * @date 2016/10/21
 * @version 1.0
 */
public class BaseRuntimeException extends RuntimeException{

	private static final long serialVersionUID = -1219117108925913372L;
	public BaseRuntimeException(String msg) {
		super(msg);
	}
}
