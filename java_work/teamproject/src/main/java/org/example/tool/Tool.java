package org.example.tool;

import lombok.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Tool {

    ToolRepository tr = new ToolRepository();

    // 책 반납 = entry(state) update order(return_date) update
    public void bookReturn() throws SQLException {
        ToolRepository tr = new ToolRepository();
        Scanner sc = new Scanner(System.in);

        System.out.print("회원 이름 : ");
        String c_name = sc.nextLine();
        System.out.print("책 이름 : ");
        String b_name = sc.nextLine();

        ResultSet eidrs = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT e_id FROM Orders WHERE c_id=(SELECT c_id FROM Customer WHERE c_name=?)");
            pstmt.setString(1,c_name);
            eidrs = pstmt.executeQuery();
            eidrs.next();


        }catch (Exception e){
            e.printStackTrace();
        }
        int e_id = eidrs.getInt("e_id");
//        System.out.println(e_id);

        tr.bookReturn(e_id, b_name, c_name);
    }

    @Getter
    @Setter
    private int o_id;
    private int c_id;
    private int e_id;
    private LocalDate start_date;
    private LocalDate end_date;
    private LocalDate extension_date;

    @Override
    public String toString() {
        return "주문기록{" +
                "주문번호: " + o_id +
                ", 고객 번호: " + c_id +
                ", e_id=" + e_id +
                ", 대여일: " + start_date +
                ", 반납일: " + end_date +
                ", 연장: " + extension_date +
                '}';
    }

}
