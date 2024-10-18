package com.green.sahwang.service.impl;

import com.green.sahwang.dto.request.JoinReqDto;
import com.green.sahwang.entity.Member;
import com.green.sahwang.entity.enumtype.MemberRole;
import com.green.sahwang.repository.MemberRepository;
import com.green.sahwang.service.JoinService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class JoinServiceImpl implements JoinService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    public void join(JoinReqDto joinReqDto){
        Member member = modelMapper.map(joinReqDto, Member.class);
        member.setPassword(passwordEncoder.encode(joinReqDto.getPassword()));
//        member.setRole();
        member.setJoinDate(LocalDateTime.now());
        member.setRole(MemberRole.USER);
        memberRepository.save(member);
    }

}
