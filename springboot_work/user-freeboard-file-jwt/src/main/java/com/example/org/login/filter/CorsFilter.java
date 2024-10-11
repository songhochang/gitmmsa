package com.example.org.login.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // CORS 헤더 설정
        response.setHeader("Access-Control-Allow-Origin", "*"); // 허용할 도메인 설정
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS"); // 허용할 HTTP 메서드
        response.setHeader("Access-Control-Allow-Headers", "*"); // 허용할 헤더
        response.setHeader("Access-Control-Allow-Credentials", "true"); // 쿠키 전달 허용
        response.setHeader("Access-Control-Max-Age", "3600"); // Preflight 요청 캐시 시간 설정

        // Preflight 요청일 경우 응답 처리
        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            System.out.println("OPTIONS");
            response.setStatus(HttpServletResponse.SC_OK);
            return;
        }
        // Preflight 요청이 아닐 경우 다음 필터로 요청 전달
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
