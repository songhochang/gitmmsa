package org.example.book;

import java.sql.*;
import java.util.Scanner;

public class Book {

    public void insert(){
        BookRepository br = new BookRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("책 이름 : ");
        String b_name = sc.nextLine();
        System.out.print("장르 : ");
        String b_type = sc.next();
        System.out.print("출판사 : ");
        String publisher = sc.next();
        System.out.print("국내/해외 : ");
        String country = sc.next();

        br.insert(b_name, b_type, publisher, country);

    }
    public void update() throws SQLException {
        BookRepository br = new BookRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("책 이름 : ");
        String b_name = sc.nextLine();
        System.out.print("장르 : ");
        String b_type = sc.next();
        System.out.print("출판사 : ");
        String publisher = sc.next();
        System.out.print("국내/해외 : ");
        String country = sc.next();

        ResultSet rs = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT b_id from Book WHERE b_name=?");
            pstmt.setString(1,b_name);
            rs = pstmt.executeQuery();
            rs.next();
        }catch (Exception e){
            e.printStackTrace();
        }
        int b_id = rs.getInt("b_id");
        br.update(b_id, b_name, b_type, publisher, country);
    }
    public void delete() throws SQLException {
        BookRepository br = new BookRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("책 이름 : ");
        String b_name = sc.nextLine();
        ResultSet rs = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT b_id FROM Book WHERE b_name=?");
            pstmt.setString(1,b_name);
            rs = pstmt.executeQuery();
            rs.next();
        }catch (Exception e){
            e.printStackTrace();
        }
        int b_id = rs.getInt("b_id");
        br.delete(b_id);
    }
    public void select(){
        BookRepository br = new BookRepository();
        br.select();
    }

}
