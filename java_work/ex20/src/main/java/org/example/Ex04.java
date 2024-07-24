package org.example;

public class Ex04 {

    public static void main(String[] args) {

        //throws 예외전달
        //throw 예외생성

        try {
            throw new MyException(new ErrorCode(
                    "Enter Id",
                    "A101",
                    "Enter ID in Eng"));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

}
