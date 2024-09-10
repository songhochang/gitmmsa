package com.example.ex04.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select() {
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@Valid @RequestBody UserReqDto userReqDto) {
        System.out.println("실행");

//        User user = new User();
//        user.setAge(userReqDto.getAge());
//        user.setName(userReqDto.getName());
//        user.setEmail(userReqDto.getEmail());

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);
        return "ok";

    }

    @DeleteMapping("delete/{idx}")
    public String delete(@PathVariable long idx){
        userRepository.deleteById(idx);
        return "deleted";
    }
}
