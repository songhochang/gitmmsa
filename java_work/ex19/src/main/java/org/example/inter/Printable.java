package org.example.inter;

public interface Printable {

    // static final 변수를 대문자로 짓는게 관례
    public static final int HEIGHT = 70;
    public static final int WIDTH = 120;

    void print(String mydoc);


    default void clean(){
        System.out.println("Add Cleaner");
    }

    static void printLine(){
        System.out.println("한줄 출력...");
    }

}
