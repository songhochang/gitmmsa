package org.example;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Library {

    public void inputUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("신규 회원 이름 : ");
        String c_name = scanner.next();
        System.out.print("전화번호 : ");
        String c_phonenum = scanner.next();
        System.out.print("가입연도 : ");
        int year = scanner.nextInt();
        System.out.print("월 : ");
        int month = scanner.nextInt();
        System.out.print("일 : ");
        int day = scanner.nextInt();

        LocalDate startdate = LocalDate.of(year,month,day);

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");

            pstmt = conn.prepareStatement("INSERT INTO Customer (c_name,c_phone,c_state,join_date) VALUES (?,?,'1',?)");
            pstmt.setString(1, c_name);
            pstmt.setString(2, c_phonenum);
            pstmt.setDate(3, Date.valueOf(startdate));

            pstmt.executeUpdate();

            System.out.println("정상적으로 등록 되었습니다");
            System.out.println();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류");
        }

    }

    public void inputBook(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("신규 도서 제목 : ");
        String b_name = scanner.nextLine();
        System.out.print("장르 : ");
        String b_type = scanner.nextLine();
        System.out.print("출판사 : ");
        String publisher = scanner.nextLine();
        System.out.print("국내/해외 : ");
        String country = scanner.nextLine();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");

            pstmt = conn.prepareStatement("INSERT INTO Book (b_name,b_type,publisher,state,b_country) VALUES (?,?,?,'1',?)");
            pstmt.setString(1, b_name);
            pstmt.setString(2, b_type);
            pstmt.setString(3, publisher);
            pstmt.setString(4, country);

            pstmt.executeUpdate();

            System.out.println("정상적으로 등록 되었습니다");
            System.out.println();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void loanBook(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("대출 하는 회원 이름 : ");
        String cusname = scanner.next();
        System.out.print("대출 하는 도서 이름 : ");
        String bookname = scanner.next();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rscid = null;
        ResultSet rsbid = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pj_test","root","1234");

            pstmt = conn.prepareStatement("SELECT c_id FROM Customer WHERE c_name = ?");
            pstmt.setString(1, cusname);
            rscid = pstmt.executeQuery();
            rscid.next();

            pstmt = conn.prepareStatement("SELECT b_id FROM Book WHERE b_name = ?");
            pstmt.setString(1, bookname);
            rsbid = pstmt.executeQuery();
            rsbid.next();

            pstmt = conn.prepareStatement("INSERT INTO Orders (start_date,end_date,c_id,b_id) Values (?,?,?,?)");

            LocalDate start_date = LocalDate.now();
            LocalDate end_date = start_date.plusDays(7);

            pstmt.setDate(1, Date.valueOf(start_date));
            pstmt.setDate(2, Date.valueOf(end_date));
            pstmt.setInt(3, rscid.getInt("c_id"));
            pstmt.setInt(4, rsbid.getInt("b_id"));
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("UPDATE Book SET state='대출중' WHERE b_id=?");
            pstmt.setInt(1,rsbid.getInt("b_id"));
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void returnbook(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("반납하는 도서 이름 : ");
        String bookname = scanner.next();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pj_test","root","1234");

            pstmt = conn.prepareStatement("UPDATE Book SET state='대기중' WHERE b_name=? AND state='대출중'");
            pstmt.setString(1,bookname);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void viewAllBooks(){

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");

            pstmt = conn.prepareStatement("SELECT * FROM Book");
            rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println("b_id = %d b_name = %s".formatted(rs.getInt("b_id"), rs.getString("b_name")));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void inputstaff(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("직원 이름 : ");
        String s_name = scanner.next();
        System.out.print("직급 : ");
        String s_rank = scanner.next();
        System.out.print("입사연도 : ");
        int year = scanner.nextInt();
        System.out.print("월 : ");
        int month = scanner.nextInt();
        System.out.print("일 : ");
        int day = scanner.nextInt();

        LocalDate startdate = LocalDate.of(year,month,day);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO staff (s_name,s_rank,s_startdate) VALUES (?,?,?)");
            pstmt.setString(1,s_name);
            pstmt.setString(2,s_rank);
            pstmt.setDate(3,Date.valueOf(startdate));

            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void customerendateinput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("탈퇴 회원 이름 : ");
        String name = scanner.next();
        System.out.print("탈퇴연도 : ");
        int year = scanner.nextInt();
        System.out.print("월 : ");
        int month = scanner.nextInt();
        System.out.print("일 : ");
        int day = scanner.nextInt();

        LocalDate enddate = LocalDate.of(year,month,day);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("UPDATE Customer SET c_state='2', withdraw_date=? WHERE c_name=?");
            pstmt.setDate(1,Date.valueOf(enddate));
            pstmt.setString(2,name);

            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void updatestaffedate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("퇴직 인원 이름 : ");
        String s_name = scanner.next();
        System.out.println("연도 : ");
        int year = scanner.nextInt();
        System.out.println("월 : ");
        int month = scanner.nextInt();
        System.out.println("일 : ");
        int day = scanner.nextInt();

        LocalDate enddate = LocalDate.of(year,month,day);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("UPDATE staff SET s_enddate=? WHERE s_name=?");
            pstmt.setDate(1,Date.valueOf(enddate));
            pstmt.setString(2,s_name);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void entryinput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("담장 행정 : ");
        String book = scanner.nextLine();

        LocalDate localDate = LocalDate.of(2023, 11, 5);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT b_id FROM Book WHERE b_name=?");
            pstmt.setString(1,book);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            pstmt = conn.prepareStatement("INSERT INTO entry (insertdate,s_id,b_id) VALUES(?,4,?)");
            pstmt.setDate(1,Date.valueOf(localDate));
            pstmt.setString(2, rs.getString("b_id"));
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
