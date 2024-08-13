package org.example;

// Person 클래스에서 comparable을 상속받아 compareTo메서드를 재정의해서
// 이름글자의 갯수로 오름차순, 내림차순으로 하였는데
// 이 탐색의 기준이 이름(사전편찬순으로) 되도록 수정하자

import java.util.Arrays;

public class Hw01 {

    public static void main(String[] args) {

        String str = "abcde";

        Person[] parr = {
                new Person("홍길동", 20),
                new Person("박길동", 30),
                new Person("김길동", 20)
        };

        Arrays.sort(parr);

        for(Person p:parr){
            System.out.println(p);
        }



    }

}
