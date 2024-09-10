package org.example;

import org.example.book.Book;
import org.example.entry.Entry;
import org.example.entry.EntryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        Entry entry = new Entry();
        Book book = new Book();

        while (true){
            System.out.println("""
                    1. Book
                    2. Customer
                    3. staff
                    4. entry
                    5. Order
                    """);
            int cho = sc.nextInt();

            if(cho == 1){
                System.out.println("""
                        1. insert
                        2. update
                        3. delete
                        4. select
                        """);
                int bcho = sc.nextInt();

                if(bcho == 1){
                    book.insert();
                }
                else if (bcho == 2){
                    book.update();
                }
                else if (bcho == 3){
                    book.delete();
                }
                else if (bcho == 4){
                    book.select();
                }
            }
            else if(cho == 2){
                break;
            }
            else if(cho == 3){
                break;
            }
            else if(cho == 4){
                System.out.println("""
                        1. insert
                        2. update
                        3. delete
                        4. select
                        """);

                int echo = sc.nextInt();

                if(echo == 1){
                    entry.insert();
                }
                else if (echo == 2){
                    entry.update();
                }
                else if (echo == 3){
                    entry.delete();
                }
                else if (echo == 4){
                    entry.select();
                }

            }
            else {
                break;
            }
        }



    }
}