package org.example;

interface AA{
    int doA();
    default void doB(){
        System.out.println("doB");
    }
    static void doC(){
        System.out.println("doC");
    }
}

public class Ex03 {

    public static void doMethod(AA aa){
        aa.doA();
        aa.doB();
        AA.doC();
    }

    public static void main(String[] args) {

        AA aa = () -> 10;

        int result = aa.doA();
        System.out.println(result);

//        doMethod(()->System.out.println("새로운 함수 정의"));
    }

}
