package com.yuxuan66.yxbaseframe.common.base;
/**
 * 基础异常处理类
 * 在此类进行如记录异常信息等操作
 * @author Sir丶雨轩
 * @date 2016/10/21
 * @version 1.0
 */
public class BaseException extends Exception{

	private static final long serialVersionUID = 8820056788915664655L;
	public BaseException(String msg) {
		super(msg);
	}
}
