package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBRepository {

    /*
    1. Class.forname jar
    2. Connection DB 연결
    3. PrepareStatement sql구문작성
    4. sql 구문 실행
    executeUpdate(); -> insert, update,delete, create, alter 문 등등
    executeQuery(); -> select 문 실행
     */

    public void insert() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        // Exception 소스 상에서 해결을 해야되고
        // RuntimeException 소스 상에서 해결안해도 됨

        // 강제 예외 발생
        // throw new RuntimeException();
        // 강제 예외 발생
        // throw new Exception();

        try {

            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa",
                    "root",
                    "1234");

            pstmt = conn.prepareStatement("INSERT INTO aaa (name,age) VALUES (?,?)");
            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1,name);
            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            pstmt.setInt(2,age);

            pstmt.executeUpdate();

        }catch (Exception e){

            e.printStackTrace();

        }finally {

            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){

            }

        }

    }

    public void delete() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        // Exception 소스 상에서 해결을 해야되고
        // RuntimeException 소스 상에서 해결안해도 됨

        // 강제 예외 발생
        // throw new RuntimeException();
        // 강제 예외 발생
        // throw new Exception();

        try {

            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa",
                    "root",
                    "1234");

            pstmt = conn.prepareStatement("DELETE FROM aaa where id = ?");

            int id = Integer.parseInt(JOptionPane.showInputDialog("id"));
            pstmt.setInt(1,id);

            pstmt.executeUpdate();

        }catch (Exception e){

            e.printStackTrace();

        }finally {

            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){

            }

        }

    }

    public void update() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        // Exception 소스 상에서 해결을 해야되고
        // RuntimeException 소스 상에서 해결안해도 됨

        // 강제 예외 발생
        // throw new RuntimeException();
        // 강제 예외 발생
        // throw new Exception();

        try {

            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa",
                    "root",
                    "1234");

            pstmt = conn.prepareStatement("UPDATE aaa SET name = ?, age = ? where id = ?");
            String name = JOptionPane.showInputDialog("변경할 이름");
            int age = Integer.parseInt(JOptionPane.showInputDialog("변경할 나이"));
            int id = Integer.parseInt(JOptionPane.showInputDialog("변경할 id"));

            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setInt(3,id);

            pstmt.executeUpdate();

        }catch (Exception e){

            e.printStackTrace();

        }finally {

            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){

            }

        }

    }

    public void select() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        ResultSet rs = null;
        // Exception 소스 상에서 해결을 해야되고
        // RuntimeException 소스 상에서 해결안해도 됨

        // 강제 예외 발생
        // throw new RuntimeException();
        // 강제 예외 발생
        // throw new Exception();

        try {

            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa",
                    "root",
                    "1234");

            pstmt = conn.prepareStatement("SELECT * FROM aaa");

            rs = pstmt.executeQuery();
            while (rs.next()){
//                System.out.println("id = " + rs.getInt("id"));
//                System.out.println("name = " + rs.getString("name"));
//                System.out.println("age = " + rs.getInt("age"));
//                System.out.println();
                System.out.println("""
                        id = %d
                        name = %s  age = %d
                        """.formatted(rs.getInt("id"), rs.getString("name"), rs.getInt("age")));
            }

        }catch (Exception e){

            e.printStackTrace();

        }finally {

            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){

            }

        }

    }



}
