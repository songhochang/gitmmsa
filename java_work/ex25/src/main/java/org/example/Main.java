package org.example;

import java.util.Scanner;

public class Main {

    Main(){

        Scanner sc = new Scanner(System.in);

        DBRepository dbRepository = new DBRepository();

        while(true){

            System.out.println("""
                    1.입력
                    2.조회
                    3.수정
                    4.삭제
                    5.종료
                    """);
            int cho = sc.nextInt();
            System.out.println(cho);

            if(cho == 1){
                dbRepository.insert();
            }
            else if(cho == 2){
                dbRepository.select();
            }
            else if(cho == 3){
                dbRepository.update();
            }
            else if(cho == 4){
                dbRepository.delete();
            }
            else{
                System.out.println("종료됨...");
                break;
            }

        }

    }

    public static void main(String[] args) {

        new Main();

    }
}