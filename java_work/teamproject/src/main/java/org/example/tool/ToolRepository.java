package org.example.tool;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ToolRepository {

    private int e_id;
    private String b_name;
    private String c_name;

    public void bookReturn(int e_id, String b_name, String c_name){

        this.e_id = e_id;
        this.b_name = b_name;
        this.c_name = c_name;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("UPDATE Orders SET return_date=? WHERE c_id=(SELECT c_id FROM Customer WHERE c_name=?) AND e_id=?");
            pstmt.setDate(1, Date.valueOf(LocalDate.now()));
            pstmt.setString(2,c_name);
            pstmt.setInt(3,e_id);
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("UPDATE entry SET state=0 WHERE e_id=? AND b_id=(SELECT b_id FROM Book WHERE b_name=?)");
            pstmt.setInt(1,e_id);
            pstmt.setString(2,b_name);
            pstmt.executeUpdate();

            System.out.println();
            System.out.println("반납 되었습니다");
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void rental() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("손님 이름: ");
        String c_name = scanner.nextLine();
        System.out.print("빌리는 책 이름 : ");
        String b_name = scanner.nextLine();

        ResultSet bidrs = null;
        ResultSet eidrs = null;
        ResultSet cidrs = null;

        try {
            Connection conn
                    = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library", "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT b_id FROM Book WHERE b_name = ?");
            pstmt.setString(1, b_name);
            bidrs = pstmt.executeQuery();
            bidrs.next();
            int b_id = bidrs.getInt("b_id");

            pstmt = conn.prepareStatement("SELECT e_id FROM entry WHERE b_id = ?");
            pstmt.setInt(1, b_id);
            eidrs = pstmt.executeQuery();
            eidrs.next();

            pstmt = conn.prepareStatement("SELECT c_id FROM Customer WHERE c_name = ?");
            pstmt.setString(1, c_name);
            cidrs = pstmt.executeQuery();
            cidrs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int e_id = eidrs.getInt("e_id");
        int c_id = cidrs.getInt("c_id");

        try {
            Connection conn
                    = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library", "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement("""
                    INSERT INTO Orders (start_date, c_id, e_id)
                                        VALUES (?, ?, ?)""");

            pstmt.setObject(1, Date.valueOf(LocalDate.now()));
            pstmt.setInt(2, c_id);
            pstmt.setInt(3, e_id);

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Connection conn
                    = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library", "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement("""
                    UPDATE entry SET state = '1' WHERE e_id = ?""");
            pstmt.setInt(1, e_id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("대여 되었습니다");
        System.out.println();
    }

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void select(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("SELECT b_name FROM entry, Book where entry.b_id = Book.b_id and state = 0");

            rs = pstmt.executeQuery();


            while (rs.next()){

                System.out.println("""
                                  booklist = %s
                                  =============================
                                """.formatted(
                        rs.getString("b_name")
                ));
            }

            System.out.println("===♡ㅎㅎ♡===");
            System.out.println();
            System.out.println();

        }catch (Exception e){

            System.out.println("오류발생");
        }
    }

    public void update1(){

        Scanner aaa = new Scanner(System.in);
        Scanner bbb = new Scanner(System.in);


        try{
            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("UPDATE Orders SET end_date=? WHERE o_id=?");

            System.out.print("id 선택(제발 번호만...)===>");
            int o_id = aaa.nextInt();
            pstmt.setInt(2,o_id);
            System.out.println();

            System.out.print("연장날짜입력(8숫자만 제발루!!!)===>");
            String return_date = bbb.nextLine();
            pstmt.setObject(1,return_date);
            System.out.println();

            String s1 = return_date.substring(0,4);
            String s2 = return_date.substring(4,6);
            String s3 = return_date.substring(6,8);

            // sql구문 실행
            pstmt.executeUpdate();

            System.out.println();
            System.out.println(o_id+"번 항목...");
            System.out.println(s1+"년."+s2+"월.."+s3+"일까짓♥");
            System.out.println("===♡ㅎㅎ♡===");
            System.out.println();
            System.out.println();


        }catch (Exception e){

            System.out.println("오류발생");
        }


        System.out.println("입장");
    }
    public void update2(){

        try{
            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("UPDATE Orders SET return_date=? WHERE o_id=?");

            int o_id = Integer.parseInt(JOptionPane.showInputDialog("o_id(키)"));
            pstmt.setInt(2,o_id);

            String end_date = JOptionPane.showInputDialog("반납일자입력(8자)");
            pstmt.setObject(1,end_date);



            // sql구문 실행
            pstmt.executeUpdate();
            System.out.println();
            System.out.println("========ㅎㅎ========");
            System.out.println();
            System.out.println();
        }catch (Exception e){

            System.out.println("오류발생");
        }
    }

}
