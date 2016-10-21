package com.yuxuan66.yxbaseframe.common.base;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 基础控制器 提供一些通用方法
 * @author Sir丶雨轩
 * @date 2016/10/20
 * @version 1.0
 */
@Controller
public class BaseController {

	@Resource
	private HttpServletRequest httpServletRequest;
	
	@RequestMapping(path="test")
	public String test(Model mo,@RequestParam Map<String, Object> params){
		
		return "test/index";
	}
}
