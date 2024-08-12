package org.example;

public class Ex01 {

    public static void main(String[] args){

        // primitive 함수가 없다
        int a = 10;
        // wrapper 클래스이기 때문에 함수가 존재
        Integer b = Integer.valueOf(30);

        System.out.println(a);
        System.out.println(b);

        // unboxing 래퍼클래스가 ㅣㄱ보낮료형 타입으로 자동 변환
        a = b; // a = b.intvalue(); 도 가능

    }

}
