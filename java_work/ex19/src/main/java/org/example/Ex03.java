package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("a : ");
            int a = sc.nextInt();
            System.out.print("b : ");
            int b = sc.nextInt();

            System.out.println("나누기 실행");
            System.out.println(a / b);
            System.out.println("나누기 끝");

            int c[] = new int[3];
            System.out.println(c[4]);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        } catch (InputMismatchException ie){
            System.out.println("숫자만......");
        } catch (Exception ae){
            System.out.println("모든 예외 상황");
        }

        System.out.println("정상 종료 되었습니다");

    }

}
