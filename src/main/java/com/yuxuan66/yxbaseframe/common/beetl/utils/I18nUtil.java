package com.yuxuan66.yxbaseframe.common.beetl.utils;

import javax.servlet.http.HttpServletRequest;

import org.beetl.core.Context;
import org.beetl.core.Function;
import org.springframework.web.servlet.support.RequestContext;

import com.yuxuan66.yxbaseframe.common.beetl.exception.BeetlException;


public class I18nUtil implements Function{

	@Override
	public Object call(Object[] obj, Context context) {
		if(obj.length < 1) {
			try {
				throw new BeetlException("ERROR(40001):wrong number of parameters");
			} catch (BeetlException e) {
				e.printStackTrace();
				return "ERROR(40001):wrong number of parameters";
			}
		}
		HttpServletRequest request = (HttpServletRequest) context.getGlobal("request");
		RequestContext requestContext = new RequestContext(request);
		String message = "";
		try {
			message = requestContext.getMessage((String)obj[0]);
			if("".equals(message) && obj.length > 1){
				message = (String)obj[(int)(1+Math.random()*(obj.length-1))];
			}
		} catch (Exception e) {
			e.printStackTrace();
			if(obj.length > 1)
				message = (String)obj[(int)(1+Math.random()*(obj.length-1))];
		}
		return message;
	}

}
