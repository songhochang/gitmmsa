package com.example.org.login;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody JoinDto joinDto){
        loginService.join(joinDto);
        return ResponseEntity.ok("success...");
    }

    @GetMapping("/login")
    public void redirectWithPost(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpServletResponse response) throws IOException {

        response.sendRedirect("/login");
    }

}
