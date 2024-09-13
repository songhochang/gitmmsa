package org.example.book;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void insert() {

        System.out.println("insert 진입");
        try {
            conn = DriverManager
                    .getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                            "root",
                            "1234");

            pstmt = conn.prepareStatement("INSERT INTO Book(b_id,b_name,b_type,publisher,country)values(?,?,?,?,?)");
            pstmt.setInt(1, 200);
            pstmt.setString(2, "나를 위한 선물");
            pstmt.setString(3, "자기계발");
            pstmt.setString(4, "함께북스");
            pstmt.setString(5, "국내도서");

            pstmt.executeUpdate();

            System.out.println();System.out.println();
            System.out.println("등록완료");
            System.out.println();
            System.out.println();System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void  select() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library", "root", "1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("SELECT* FROM Book");

            rs = pstmt.executeQuery();

            while (rs.next()) {

                System.out.println("""
                        
                        B_id = %d
                        B_name = %s
                        B_type = %s
                        publisher = %s
                        country = %s
                        
                        """
                        .formatted(rs.getInt("B_id"),
                                rs.getString("B_name"),
                                rs.getString("B_type"),
                                rs.getString("publisher"),
                                rs.getString("country")

                        )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }

    public void delete() {
        System.out.println("delete진입");
        try {
            conn = DriverManager
                    .getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                            "root",
                            "1234");

            pstmt = conn.prepareStatement("delete from Book where b_id = ?");

            int b_id = Integer.parseInt(JOptionPane.showInputDialog("b_id"));
            pstmt.setInt(1,b_id);

            pstmt.executeUpdate();

            System.out.println();System.out.println();
            System.out.println("삭제완료");
            System.out.println();
            System.out.println();System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
