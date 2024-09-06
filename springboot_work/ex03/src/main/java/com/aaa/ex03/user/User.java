package com.aaa.ex03.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement 설정
    private Long idx;

    private String name;
    private int age;

    private String email;
    private String password;

    private LocalDateTime wdate;


}

// jpa class -> table create
/*
@Configuration -> 객체 담는 통 정의
@Bean -> 그거 객체야
@Component -> 그것도 객체야
@ComponentScan -> 패키지 내용읽어서 객체 주입해줘
@Autowired -> new 예약어 안쓴고 객체 자동 할당...
private final -> @RequriedArgsConstructor -> 객체 자동 할당

@Entity -> 이거 테이블
@Table -> table 이름 변경
@Id -> Primary key
 */