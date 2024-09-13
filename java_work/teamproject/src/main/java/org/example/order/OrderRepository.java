package org.example.order;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private int e_id;
    private int c_id;
    private int b_id;

    public void insert(int e_id, int c_id){
        this.e_id = e_id;
        this.c_id = c_id;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Orders (start_date,c_id,e_id) VALUES (?,?,?)");
            pstmt.setDate(1, Date.valueOf(LocalDate.now()));
            pstmt.setInt(2,c_id);
            pstmt.setInt(3,e_id);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void returnupdate(int b_id,int c_id){
        this.c_id = c_id;
        this.b_id = b_id;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("UPDATE Orders SET end_date=? WHERE c_id=? AND b_id=?");
            pstmt.setDate(1,Date.valueOf(LocalDate.now()));
            pstmt.setInt(2,c_id);
            pstmt.setInt(3,b_id);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void select() {
        List<Order> list = new ArrayList<>();
        try {
            Connection conn
                    = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library", "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement("select * from Orders order by o_id");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Order orders = Order.builder()
                        .o_id(rs.getInt("o_id"))
                        .c_id(rs.getInt("c_id"))
                        .e_id(rs.getInt("e_id"))
                        .start_date(rs.getObject("start_date", LocalDate.class))
                        .end_date(rs.getObject("end_date", LocalDate.class))
                        .return_date(rs.getObject("return_date", LocalDate.class))
                        .build();
                list.add(orders);
            }
            list.stream()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
