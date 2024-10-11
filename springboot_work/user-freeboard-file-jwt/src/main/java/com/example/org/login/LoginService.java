package com.example.org.login;

import com.example.org.user.User;
import com.example.org.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginService implements UserDetailsService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    // 회원가입
    public void join(JoinDto joinDto){
        User user = modelMapper.map(joinDto, User.class);
        // username -> name
        user.setName(joinDto.getName());
        // 비밀번호 암호화
        user.setPassword(passwordEncoder.encode(joinDto.getPassword()));
//        user.setRole("ROLE_USER");
        user.setRole("ROLE_ADMIN");

        User dbUser = userRepository.save(user);
        System.out.println(dbUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 해당되는 이메일이 있는 지 DB에서 확인
        // 없으면 throw 로 UsernameNotFoundException 실행
        User user = userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));

        // password 가 1234이면 ADMIN 권한으로 로그인....
        // username 은 아무렇게나 들어와도 된다....
        return org.springframework.security.core.userdetails.User.builder().username(user.getEmail()).password(user.getPassword()).roles("ADMIN").build();
    }
}
