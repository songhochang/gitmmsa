package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex04 {

    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6).filter(n->n%2==1).forEach(s-> System.out.println("나온거 " + s));

        List<Member> list = Arrays.asList(
                new Member(1,"홍길동",20,"aaa@naver.com","1234"),
                new Member(2,"고길동",40,"bbb@naver.com","1234"),
                new Member(3,"하길동",30,"ccc@naver.com","1234")
        );

        int result = 0;
        for(Member member : list){
            result+= member.getAge();
            System.out.println(member);
        }
        System.out.println(result);

        list.stream().filter(member -> member.getAge()>=30).forEach(s-> System.out.println("내용 " + s.getName()));

    }

}
