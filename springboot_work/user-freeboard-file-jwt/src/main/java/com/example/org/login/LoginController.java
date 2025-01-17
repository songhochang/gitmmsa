package com.example.org.login;

import com.example.org.login.jwt.JWTManager;
import com.example.org.user.User;
import com.example.org.user.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class LoginController {

    private final LoginService loginService;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JWTManager jwtManager;

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody JoinDto joinDto){
        loginService.join(joinDto);
        return ResponseEntity.ok("success...");
    }

    @GetMapping("/login")
    public ResponseEntity<String> redirectWithPost(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpServletResponse response) throws IOException {

        User user = userRepository.findByEmail(email).orElseThrow(
                ()-> new UsernameNotFoundException(email)
        );

        boolean matches = passwordEncoder.matches(password, user.getPassword());
        System.out.println(matches);

        if(matches){
            String jwt = jwtManager.createJWT(user.getEmail(), user.getRole());
            return ResponseEntity.ok(jwt);
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("이메일 패스워드 확인해라");
        }

    }

    @GetMapping("/check")
    public ResponseEntity<User> check(
            @RequestParam("jwt") String jwt,
            HttpServletResponse response) throws IOException {

        // jwt 유호한지...
        Jws<Claims> claimsJws = jwtManager.getclaims(jwt);
        // jwt 유효하면 email 가져오기...
        String email = claimsJws.getPayload().get("email").toString();
        // email 이용해서 DB 테이블 조회...
        User user = userRepository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException(email)
        );

        return ResponseEntity.ok(user);
    }

}
