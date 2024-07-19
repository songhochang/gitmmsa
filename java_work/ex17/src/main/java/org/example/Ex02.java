package org.example;

import org.example.test.*;

public class Ex02 {

    // Springboot 프레임워크
    // 부모클래스에서 자식클래스를 담을 수 있다.
    // 자식클래스 생성했을떄 부모클래스 참조 할수 있다.
    // 클래스 다양성

    public static void main(String[] args) {

        BB[] bary = new BB[10];
        CC[] cary = new CC[10];
        AA[] ary1 = new BB[10];
        AA[] ary2 = new CC[10];

        AA a1 = new BB();
        AA a2 = new CC();

//        BB bb = new AA();

        a1.bb();
        a2.cc();

    }

}
