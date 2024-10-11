package com.example.org.login.jwt;

import com.example.org.login.LoginUserDetails;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JWTFilter extends OncePerRequestFilter {

    private final JWTManager jwtManager;

    public JWTFilter(JWTManager jwtManager) {
        this.jwtManager = jwtManager;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        System.out.println("여기 무조건 지나감ㄷㄷ");

        String auth = request.getHeader(HttpHeaders.AUTHORIZATION);
        System.out.println("auth = "+ auth);

        if (auth == null || !auth.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        // 로그인이나 회원가입시에는 로그인 설정 하지말고 지나가라
//        if(request.getRequestURI().contains("join") || request.getRequestURI().contains("login")){
//            filterChain.doFilter(request, response);
//        return;
//        }


        // JWT 토큰 유효
//        jwtManager.validJWT(auth);


        try {
//        String token = auth.substring(7);
            String token = auth.split(" ")[1];
            System.out.println("여기오냐  "+token);

            Jws<Claims> claims = jwtManager.getclaims(token);

            String email = claims.getPayload().get("email").toString();
//        String role = "ADMIN";
            String role = claims.getPayload().get("role").toString();

            LoginUserDetails loginUserDetails = new LoginUserDetails(email, null, role);

            Authentication authentication = new UsernamePasswordAuthenticationToken(
                    loginUserDetails, null, loginUserDetails.getAuthorities()
            );
            // 로그인 설정
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception e) {
            e.printStackTrace();
        }
        filterChain.doFilter(request, response);
    }
}
