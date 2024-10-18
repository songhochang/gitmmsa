package com.green.sahwang.controller;

import com.green.sahwang.dto.request.JoinReqDto;
import com.green.sahwang.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody JoinReqDto joinReqDto){
        joinService.join(joinReqDto);
        return ResponseEntity.ok("회원가입성공");
    }

}
