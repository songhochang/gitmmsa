package org.example;

import java.util.Scanner;

public class CR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("시작하시겠습니까? y / n....");
        String start_str = sc.next();
        if(start_str.equals("y")){
            doA();
        }
        else{
            System.out.println("종료합니다......");
        }

    }

    public static void doA(){

        int com_num = (int)(Math.random()*100) + 1;
        int count = 0;

        while(true){

            Scanner sc = new Scanner(System.in);

            System.out.print("숫자를 입력하세요 : ");
            int user_num = sc.nextInt();

            if(user_num > com_num){
                System.out.println("다운");
                count += 1;
            }
            else if(user_num < com_num){
                System.out.println("업");
                count += 1;
            }
            else{
                count += 1;
                System.out.println("정답입니다");
                System.out.println("시도 횟수 : " + count);
                break;
            }

        }
    }

}