package org.example;

import org.example.book.Book;
import org.example.book.BookRepository;
import org.example.customer.CustomerRepository;
import org.example.entry.Entry;
import org.example.order.Order;
import org.example.order.OrderRepository;
import org.example.staff.StaffRepository;
import org.example.tool.Tool;
import org.example.tool.ToolRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        Entry entry = new Entry();
        BookRepository br = new BookRepository();
        CustomerRepository customerRepository = new CustomerRepository();
        StaffRepository staffRepository = new StaffRepository();
        Tool tool = new Tool();

        bb:while (true) {
            System.out.println("""
                    1. 도서 관리 시스템
                    2. 회원 관리 시스템
                    3. 직원 관리 시스템
                    4. 도서 재고 관리 시스템
                    5. 대여 및 반납 시스템
                    6. 기능...
                    7. 종료
                    """);
            int cho = sc.nextInt();

            aa:while(true) {
                // BookTable
                if (cho == 1) {
                    System.out.println("""
                            1. 책 등록
                            2. 책 삭제
                            3. 전체 책 조회
                            4. 뒤로가기
                            """);
                    int bcho = sc.nextInt();

                    if (bcho == 1) {
                        br.insert();
                    } else if (bcho == 2) {
                        br.delete();
                    } else if (bcho == 3) {
                        br.select();
                    } else{
                        break;
                    }

                    // CustomerTable
                } else if (cho == 2) {
                    System.out.println("""
                            무엇을 하시겠습니까?
                            1. 전체 회원 정보 확인
                            2. 회원 가입
                            3. 회원 정보 수정            
                            4. 회원 탈퇴
                            5. 회원 삭제
                            5. 뒤로가기
                            """);

                    int n = sc.nextInt();

                    if (n == 1) {
                        customerRepository.select();
                    } else if (n == 2) {
                        customerRepository.insert();
                    } else if (n == 3) {
                        customerRepository.update();
                    } else if(n == 4) {
                        customerRepository.update_withdraw();
                    }
                    else if (n == 5) {
                        customerRepository.delete();
                    } else{
                        break;
                    }

                    //StaffTable
                } else if (cho == 3) {
                    System.out.println("staff 테이블");

                    System.out.println("""
                            1 : 직원 등록
                            2 : 직원 조회
                            3 : 직원 정보 삭제
                            4 : 직원 정보 수정
                            5 : 뒤로가기
                            """);

                    int num2 = sc.nextInt();

                    switch (num2) {

                        case 1: {
                            System.out.println("staff 인설트 진입");
                            staffRepository.insert();
                            break;
                        }

                        case 2: {
                            System.out.println("staff 셀렉트 진입");
                            staffRepository.select();
                            break;
                        }

                        case 3: {
                            System.out.println();
                            System.out.println("staff 딜리트 진입");
                            System.out.println();
                            staffRepository.delete();
                            break;
                        }

                        case 4: {
                            System.out.println("staff 업데이트");
                            staffRepository.update();
                            break;
                        }

                        default:
                            break aa;

                    }

                    //EntryTable
                } else if (cho == 4) {
                    System.out.println("""
                            1. 책 등록
                            2. 책 상태 업데이트
                            3. 책 삭제 업데이트
                            4. entry 테이블 조회
                            5. 뒤로가기
                            """);

                    int echo = sc.nextInt();

                    if (echo == 1) {
                        entry.insert();
                    } else if (echo == 2) {
                        entry.update();
                    } else if (echo == 3) {
                        entry.delete();
                    } else if (echo == 4) {
                        entry.select();
                    } else{
                        break;
                    }

                    //OrderTable
                } else if (cho == 5) {
                    Order order = new Order();
                    OrderRepository orderRepository = new OrderRepository();
                    System.out.println("""
                            1. 대여
                            2. 반납
                            3. 조회
                            4. 뒤로가기
                            """);

                    int ocho = sc.nextInt();

                    if (ocho == 1) {
                        order.insert();
                    } else if (ocho == 2) {
                        order.returnupdate();
                    } else if (ocho == 3) {
                        orderRepository.select();
                    } else{
                        break;
                    }

                } else if (cho == 6) {
                    ToolRepository tr = new ToolRepository();
                    System.out.println("""
                            1. 책대여
                            2. 책반납(송호창)
                            3. 반납기한연장
                            4. 책반납(이동현)
                            5. 대여 가능 책 조회
                            6. 뒤로가기
                            """);
                    int tcho = sc.nextInt();
                    if (tcho == 1) {
                        tr.rental();
                    } else if (tcho == 2) {
                        tool.bookReturn();
                    } else if (tcho == 3) {
                        tr.update1();
                    } else if (tcho == 4) {
                        tr.update2();
                    } else if (tcho == 5) {
                        tr.select();
                    } else{
                        break;
                    }
                } else {
                    System.out.println("시스템을 종료합니다...");
                    break bb;
                }
            }
        }
    }
}
