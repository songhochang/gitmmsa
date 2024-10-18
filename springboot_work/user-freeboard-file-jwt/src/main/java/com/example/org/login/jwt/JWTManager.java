package com.example.org.login.jwt;

import com.example.org.error.JWTAuthException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class JWTManager {

    private final Environment environment;

    // jwt 생성
    public String createJWT(String email, String role){

        String secrekey = environment.getProperty("spring.jwt.secret");
        String jwt = Jwts.builder()
                .claim("email",email)
                .claim("role",role)
                .issuedAt(new Date(System.currentTimeMillis())) // 현재 시간
//                .expiration(new Date(System.currentTimeMillis() + 1000)) // 1초 지나면 유효기간 지남
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24)) // 1초 * 60 * 60 * 24 -> 1일 유효
                .signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encodeToString(secrekey.getBytes()))
                .compact();

        return jwt;
    }

    // jwt 유효한 지 검사 설정한 비밀번호까지
    public String validJWT(String jwt){
        String secrekey = environment.getProperty("spring.jwt.secret");
        try {
            SecretKey secretKey = new SecretKeySpec(secrekey.getBytes(), Jwts.SIG.HS256.key().build().getAlgorithm());
            Jws<Claims> claims = Jwts.parser()
                    .verifyWith(secretKey)
                    .build()
                    .parseSignedClaims(jwt);
            // 만약에 유효시간이 지났으면 JWT 사용못하게...
            claims.getPayload().getExpiration().before(new Date());
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }

    public Jws<Claims> getclaims(String jwt){
        String secrekey = environment.getProperty("spring.jwt.secret");
        try {
            // 바밀번호 설정
            SecretKey secretKey
                    = new SecretKeySpec(secrekey.getBytes(),
                    Jwts.SIG.HS256.key().build().getAlgorithm());
            // 해당 비밀번호로 jwt 토큰 복호화 해서 claims 가져오기
            Jws<Claims> claims = Jwts.parser()
                    .verifyWith(secretKey)
                    .build()
                    .parseSignedClaims(jwt);
            // claims 안에서 email 가져오기
            return claims;
        }catch (Exception e){
            throw new JWTAuthException("JWT TOKEN : " + e.getMessage());
        }
    }

}
