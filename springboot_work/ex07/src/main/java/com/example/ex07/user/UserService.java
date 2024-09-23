package com.example.ex07.user;

import com.example.ex07.error.BizException;
import com.example.ex07.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    // email 중복이면 에러코드
    // email 중복아니면 insert 정상적 입력...

    public void insert(UserReqDto userReqDto){

        Optional<User> optionalUser = userRepository.findByEmail(userReqDto.getEmail());

        optionalUser.ifPresent(user -> {throw new BizException(ErrorCode.DUPLICATE_USERS);});

        System.out.println("실행");
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        System.out.println("user = " + user);
        userRepository.save(user);
    }

}
