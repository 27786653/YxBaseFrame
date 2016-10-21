package com.yuxuan66.yxbaseframe.common.filter;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.i18n.SessionLocaleResolver;


@WebFilter("/LocaleFilter")
public class LocaleFilter implements Filter {



	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Locale locale = new Locale("zh","CN");
		Cookie[] cookies = ((HttpServletRequest)request).getCookies();
		if(cookies != null && cookies.length > 0){
			for (Cookie cookie : cookies) {
				if("lang".equals(cookie.getName())){
					if("en".equals(cookie.getValue()))
						locale = new Locale("en","US");
				}
			}
		}
		((HttpServletRequest)request).getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

}
