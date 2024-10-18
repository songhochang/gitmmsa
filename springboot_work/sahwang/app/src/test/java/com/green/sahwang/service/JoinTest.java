package com.green.sahwang.service;

import com.green.sahwang.dto.request.JoinReqDto;
import com.green.sahwang.entity.Member;
import com.green.sahwang.entity.product.Candle;
import com.green.sahwang.entity.product.Diffuser;
import com.green.sahwang.entity.product.Perfume;
import com.green.sahwang.repository.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JoinTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private JoinService joinService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    public void testJoinService(){
        JoinReqDto joinReqDto =
                new JoinReqDto("가나다", "abc@example.com", "qwerqwer","010-1234-5678");
        joinService.join(joinReqDto);

        Member findMember = memberRepository.findByEmail("abc@example.com");

        assertThat(passwordEncoder.matches(joinReqDto.getPassword(),findMember.getPassword())).isTrue();
    }



}
