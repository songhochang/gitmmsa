package org.example.entry;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Entry {

    public static void main(String[] args) throws SQLException {

        EntryRepository er = new EntryRepository();

        while (true){

            System.out.println("""
                1 insert
                2 update
                3 delete
                4 select
                """);
            Scanner sc = new Scanner(System.in);
            int cho = sc.nextInt();

            if(cho == 1){
                sc.nextLine();
                System.out.print("관리자 이름 : ");
                String s_name = sc.nextLine();
                System.out.print("책 이름 : ");
                String b_name = sc.nextLine();
                System.out.print("etc : ");
                String etc = sc.nextLine();
                System.out.print("state : ");
                String state = sc.nextLine();

                LocalDate insertdate = LocalDate.now();

                ResultSet srs = null;
                ResultSet brs = null;

                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
                    PreparedStatement pstmt = conn.prepareStatement("SELECT s_id FROM staff WHERE s_name = ?");
                    pstmt.setString(1,s_name);
                    srs = pstmt.executeQuery();
                    srs.next();
                    pstmt = conn.prepareStatement("SELECT b_id FROM Book WHERE b_name=?");
                    pstmt.setString(1,b_name);
                    brs = pstmt.executeQuery();
                    brs.next();

                }catch (Exception e){
                    e.printStackTrace();
                }
                int s_id = srs.getInt("s_id");
                int b_id = brs.getInt("b_id");

                er.insert(insertdate,etc,state,s_id,b_id);
            }
            else if(cho == 2){
                break;
            }
            else if(cho == 3){
                break;
            }
            else if(cho == 4){
                break;
            }
            else {
                System.out.println("시스템을 종료합니다");
                break;
            }
        }
    }



}
