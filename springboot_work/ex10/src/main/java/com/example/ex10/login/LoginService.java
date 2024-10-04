package com.example.ex10.login;

import com.example.ex10.user.User;
import com.example.ex10.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public void join(JoinDto joinDto){
        User user = modelMapper.map(joinDto, User.class);
        // username -> name
        user.setName(joinDto.getUsername());
        // 비밀번호 암호화
        user.setPassword(passwordEncoder.encode(joinDto.getPassword()));
//        user.setRole("ROLE_USER");
        user.setRole("ROLE_ADMIN");

        User dbUser = userRepository.save(user);
        System.out.println(dbUser);

    }

}
