package com.example.org.login.jwt;

import com.example.org.login.LoginUserDetails;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.security.auth.message.AuthException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTFilter extends OncePerRequestFilter {

    private final JWTManager jwtManager;

    public JWTFilter(JWTManager jwtManager) {
        this.jwtManager = jwtManager;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String auth = request.getHeader(HttpHeaders.AUTHORIZATION);
        System.out.println("auth = "+ auth);
        // 로그인 처리 안함.. jwt 넘어오지 않으면...
        if (auth == null || !auth.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        else {
            try {
                String token = auth.split(" ")[1];

                Jws<Claims> claims = jwtManager.getclaims(token);

                String email = claims.getPayload().get("email").toString();
                String role = claims.getPayload().get("role").toString();

                LoginUserDetails loginUserDetails = new LoginUserDetails(email, null, role);

                Authentication authentication = new UsernamePasswordAuthenticationToken(
                        loginUserDetails, null, loginUserDetails.getAuthorities()
                );
                // 로그인 설정
                SecurityContextHolder.getContext().setAuthentication(authentication);
            } catch (Exception e) {
                System.out.println(e.getMessage());
//                throw new AuthException(e.getMessage());
            }
        }
        filterChain.doFilter(request, response);
    }
}
