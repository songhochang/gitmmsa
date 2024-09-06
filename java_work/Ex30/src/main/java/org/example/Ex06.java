package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Ex06 {

    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa","root","1234");
            pstmt = conn.prepareStatement("select * from aaa");

            rs = pstmt.executeQuery();

            while(rs.next()){
                Member member = new Member(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                list.add(member);
            }

            System.out.println(list);


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }

    }

}
