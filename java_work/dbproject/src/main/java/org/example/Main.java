package org.example;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while(true){
            System.out.println("""
                    1. 신규 회원 등록
                    2. 신규 도서 등록
                    3. 도서 대출
                    4. 도서 반납
                    5. 전체 도서 조회
                    6. 연체 도서 조회
                    7. 종료
                    """);
            int cho = scanner.nextInt();

            if(cho == 1){
                library.inputUser();
            }
            else if(cho == 2){
                library.inputBook();
            }
            else if(cho == 3){
                library.loanBook();
            }
            else if(cho == 4){
                library.returnbook();
            }
            else if(cho == 5){
                library.viewAllBooks();
            }
            else if(cho == 6){
                break;
            }
            else if(cho == 10){
                library.inputstaff();
            }
            else if(cho == 11){
                library.customerendateinput();
            }
            else if(cho == 12){
                library.updatestaffedate();
            }
            else if(cho == 13){
                library.entryinput();
            }
            else{
                System.out.println("시스템을 종료합니다...");
                break;
            }
        }

    }
}