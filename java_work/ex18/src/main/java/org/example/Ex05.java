package org.example;

class A {

    /*
    배열에서 클래스 다형성 문법으로
    Friend 클래스 배열로 친구관리를 할 수 있는 프로그램
    오버라이드
    @Override - 부모클래스에 존재하는 매서드를 재정의 할때만 사용 할 수 있음.(생략도 가능)
              - 존재하지 않는 매서드에 @Override 적으면 컴파일 에러
    toString 매서드
    Object obj = new String();
    Object obj = new A();

    final
    변수에 사용시 상수
    매서드에 사용 시 오버라이드 불가
    클래스에 사용 시 상속 불가
     */

}

public class Ex05 {

    public static void main(String[] args) {

        A a = new A();

    }

}
