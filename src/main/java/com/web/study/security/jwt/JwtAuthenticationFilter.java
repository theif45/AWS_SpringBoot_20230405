package com.web.study.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends GenericFilterBean{

	private final JwtTokenProvider jwtTokenProvider;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String token = getToken(request);
		
		System.out.println("token: " + token);
		
		boolean validationFlag = jwtTokenProvider.validateToken(token);
		System.out.println("flag: " + validationFlag);;
		
		if(validationFlag) {
			Authentication authentication = jwtTokenProvider.getAuthentication(token);
			// SecurityContext에 Authentication객체가 들어있으면 로그인 인증된것
			SecurityContextHolder.getContext().setAuthentication(authentication);
		}
		
		chain.doFilter(request, response);
	}

	private String getToken(ServletRequest request) {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String type = "Bearer";
		String token = httpServletRequest.getHeader("Authorization");
		
		// hasText 문자열이 Null, 공백이 아닌지 확인
		if(StringUtils.hasText(token) && token.startsWith(type)) {
			return token.substring(type.length() +1);
		}
		return null;
	}
}
