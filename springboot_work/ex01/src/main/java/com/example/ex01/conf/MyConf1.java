package com.example.ex01.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스피링 객체 담는 통 정의
@ComponentScan(basePackages = "com.example.ex01.member") // 어떤 디렉토리를 읽어서 객체 주입해달라...
public class MyConf1 {
}
