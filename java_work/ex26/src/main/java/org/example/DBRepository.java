package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBRepository {

    public List<Member> select(){

        List<Member> list = new ArrayList<>();

        Connection conn = null; // DB 연결객체
        PreparedStatement pstmt = null; // sql 객체
        ResultSet rs = null; // 반환되는값을 담는 객체

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa","root","1234");
            pstmt = conn.prepareStatement("select * from aaa"); // sql 구문 작성
            rs = pstmt.executeQuery(); // sql 구문 시행

            while(rs.next()){

                Member member = new Member();
                member.setAge(rs.getInt("age"));
                member.setId(rs.getInt("id"));
                member.setName(rs.getString("name"));
                member.setEmail(rs.getString("email"));
                member.setPassword(rs.getString("password"));

                list.add(member);


            }

            return list;

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }

        return null;

    }

}
