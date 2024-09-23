package com.example.ex07.freeboard;

import com.example.ex07.user.User;
import com.example.ex07.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FreeBoardControllerTest {

    @Autowired
    FreeBoardRepository freeBoardRepository;

    @Autowired
    UserRepository userRepository;

    @Test
//    @Transactional
    void insertTest(){
        User user = User.builder().name("나길동").age(25).email("derf@naver.com").password("1234").build();

        FreeBoard freeBoard = FreeBoard.builder().title("제목").content("내용").user(user).build();

        freeBoardRepository.save(freeBoard);
    }

    @Test
    void selectTest(){
        List<FreeBoard> list = freeBoardRepository.findAll();
        list.stream().forEach(System.out::println);

    }

    @Test
    void deleteTest(){
        freeBoardRepository.deleteById(1L);
    }

    @Test
    void updateTest(){

        User user = User.builder().name("홍길동").age(20).email("ffff@naver.com").password("1234").build();

        FreeBoard freeBoard = FreeBoard.builder().idx(4L).title("제목").content("내용").user(user).build();

        freeBoardRepository.save(freeBoard);

    }

}