package org.example;

import java.util.Scanner;

public class CR {

    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("시작하시겠습니까? y / n....");
            String start_str = sc.next();

            if(start_str.equals("y")){
                updown();
                break;
            }
            else if(start_str.equals("n")){
                System.out.println("종료합니다......");
                break;
            }
            else{
                System.out.println("y / n 중에서 입력해주세요...");
                System.out.println();
            }

        }

    }

    public static void updown(){

        int com_num = (int)(Math.random()*100) + 1;
        int count = 0;

        while(true){

            Scanner sc = new Scanner(System.in);

            System.out.print("숫자를 입력하세요 : ");
            int user_num = sc.nextInt();
            count += 1;

            if(user_num > com_num){
                System.out.println("다운");
            }
            else if(user_num < com_num){
                System.out.println("업");
            }
            else{
                System.out.println("정답입니다");
                System.out.println("시도 횟수 : " + count);
                break;
            }

        }

    }

}
