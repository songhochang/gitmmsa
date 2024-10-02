package com.example.ex10.freeboard;

import com.example.ex10.file.FileEntity;
import com.example.ex10.user.User;
import com.example.ex10.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class FreeBoardControllerTest {

    // 스프링 객체 담는 통에서.... freeboardRepository 객체 가져오기
    @Autowired
    FreeBoardRepository freeBoardRepository;

    @Autowired
    UserRepository userRepository;

    // 1. UserRepository
    // 2. Cascade JPA 속성

    //    TransientPropertyValueException
    @Test
//    @Transactional
    void insertTest() {
//        User user = User.builder()
//                .idx(1l)
//                .name("홍길동")
//                .age(20)
//                .email("ccc@naver.com")
//                .password("password")
//                .build();

//        userRepository.save(user);

        User user = userRepository.findById(1l).orElseThrow();

        FreeBoard freeBoard = FreeBoard.builder()
                .idx(2l)
                .title("제목")
                .content("내용")
                .user(user)
                .build();
        freeBoardRepository.save(freeBoard);
    }

    @Test
    void selectTest() {
        List<FreeBoard> list = freeBoardRepository.findAll();
        list.stream().forEach(System.out::println);
    }

    @Test
    void deleteTest(){
        freeBoardRepository.deleteById(5l);
    }

    @Test
    void updateTest(){
        User user = User.builder()
                .name("홍길동")
                .age(20)
                .email("bbb@naver.com")
                .password("password")
                .build();

        FreeBoard freeBoard = FreeBoard.builder()
                .idx(4l)
                .title("제목")
                .content("내용")
                .user(user)
                .build();
        freeBoardRepository.save(freeBoard);
    }

    @Test
    void saveFreeBoardTest(){
        User user = userRepository.findById(1L).orElseThrow();

        List<FileEntity> list = Arrays.asList(
                FileEntity.builder().name("afile").build(),
                FileEntity.builder().name("bfile").build()
        );

        FreeBoard freeBoard = FreeBoard.builder()
                .idx(10l)
                .title("제목1234")
                .content("내용1234")
                .list((null))
                .user(user)
                .build();

        freeBoardRepository.save(freeBoard);
    }

}