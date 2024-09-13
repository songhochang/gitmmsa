package org.example.order;

import lombok.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    public void insert() throws SQLException {
        OrderRepository or = new OrderRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("손님 이름 : ");
        String c_name = sc.nextLine();
        System.out.print("빌리는 책 이름 : ");
        String b_name = sc.nextLine();

        ResultSet bidrs = null;
        ResultSet eidrs = null;
        ResultSet cidrs = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT b_id FROM Book WHERE b_name = ?");
            pstmt.setString(1,b_name);
            bidrs = pstmt.executeQuery();
            bidrs.next();
            int b_id = bidrs.getInt("b_id");

            pstmt = conn.prepareStatement("SELECT e_id FROM entry WHERE b_id = ?");
            pstmt.setInt(1,b_id);
            eidrs = pstmt.executeQuery();
            eidrs.next();

            pstmt = conn.prepareStatement("SELECT c_id FROM Customer WHERE c_name = ?");
            pstmt.setString(1,c_name);
            cidrs = pstmt.executeQuery();
            cidrs.next();


        }catch (Exception e){
            e.printStackTrace();
        }
        int e_id = eidrs.getInt("e_id");
        int c_id = cidrs.getInt("c_id");

        or.insert(e_id,c_id);
    }

    public void returnupdate() throws SQLException {
        OrderRepository or = new OrderRepository();

        Scanner sc = new Scanner(System.in);

        System.out.print("손님 이름 : ");
        String c_name = sc.nextLine();
        System.out.print("반납할 책 이름 : ");
        String b_name = sc.nextLine();

        ResultSet bidrs = null;
        ResultSet cidrs = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT b_id FROM Book WHERE b_name = ?");
            pstmt.setString(1,b_name);
            bidrs = pstmt.executeQuery();
            bidrs.next();

            pstmt = conn.prepareStatement("SELECT c_id FROM Customer WHERE c_name = ?");
            pstmt.setString(1,c_name);
            cidrs = pstmt.executeQuery();
            cidrs.next();

        }catch (Exception e){
            e.printStackTrace();
        }
        int b_id = bidrs.getInt("b_id");
        int c_id = cidrs.getInt("c_id");

        or.returnupdate(b_id,c_id);

    }

    public void delayupdate(){

    }

    private int o_id;
    private int c_id;
    private int e_id;
    private LocalDate start_date;
    private LocalDate end_date;
    private LocalDate return_date;

    @Override
    public String toString() {
        return "주문기록{" +
                "주문번호: " + o_id +
                ", 고객 번호: " + c_id +
                ", e_id=" + e_id +
                ", 대여일: " + start_date +
                ", 반납일: " + end_date +
                ", 연장: " + return_date +
                '}';
    }

}
