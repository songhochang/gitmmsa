package org.example.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookRepository {

    private String b_name;
    private String b_type;
    private String publisher;
    private String country;
    private int b_id;

    public void insert(String b_name, String b_type, String publisher, String country){
        this.b_name = b_name;
        this.b_type = b_type;
        this.publisher = publisher;
        this.country = country;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Book (b_name,b_type,publisher,country) VALUES (?,?,?,?)");
            pstmt.setString(1, b_name);
            pstmt.setString(2, b_type);
            pstmt.setString(3, publisher);
            pstmt.setString(4, country);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void update(int b_id, String b_name, String b_type, String publisher, String country){
        this.b_id = b_id;
        this.b_name = b_name;
        this.b_type = b_type;
        this.publisher = publisher;
        this.country = country;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("UPDATE Book SET b_name=?,b_type=?,publisher=?,country=? WHERE b_id=?");
            pstmt.setString(1,b_name);
            pstmt.setString(2, b_type);
            pstmt.setString(3, publisher);
            pstmt.setString(4, country);
            pstmt.setInt(5,b_id);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void delete(int b_id){
        this.b_id = b_id;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Book WHERE b_id=?");
            pstmt.setInt(1,b_id);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void select(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Book");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println("b_id = " + rs.getInt("b_id") + " | " + "b_name = " + rs.getString("b_name") + " | " + "b_type = " + rs.getString("b_type") + " | " + "publisher = " + rs.getString("publisher") + " | " + "country = " + rs.getString("country"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
