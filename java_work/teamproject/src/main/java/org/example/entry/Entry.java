package org.example.entry;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Entry {

    public void insert() throws SQLException {

        EntryRepository er = new EntryRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("관리자 이름 : ");
        String s_name = sc.nextLine();
        System.out.print("책 이름 : ");
        String b_name = sc.nextLine();
        System.out.print("etc : ");
        String etc = sc.nextLine();
        System.out.print("state : ");
        String state = sc.nextLine();

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

        er.insert(etc,state,s_id,b_id);
    }

    String s = "";

    public void update() throws SQLException {

        EntryRepository er = new EntryRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("관리자 이름 : ");
        String s_name = sc.nextLine();
        System.out.print("책 이름 : ");
        String b_name = sc.nextLine();System.out.print("etc : ");
        String etc = sc.nextLine();
        System.out.print("state : ");
        String state = sc.nextLine();

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

        er.update(etc,state,s_id,b_id);
    }

    public void delete() throws SQLException{

        EntryRepository er = new EntryRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("관리자 이름 : ");
        String s_name = sc.nextLine();
        System.out.print("책 이름 : ");
        String b_name = sc.nextLine();System.out.print("etc : ");
        String etc = sc.nextLine();
        System.out.print("state : ");
        String state = sc.nextLine();

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

        er.delete(etc,state,s_id,b_id);
    }
    public void select() throws SQLException{

        EntryRepository er = new EntryRepository();

        er.select();

    }


}
