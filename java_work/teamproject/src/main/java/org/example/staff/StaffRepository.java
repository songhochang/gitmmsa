package org.example.staff;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StaffRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void insert() {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");

            pstmt = conn.prepareStatement("INSERT INTO staff (s_name, s_rank,s_startdate,s_enddate) VALUES (?,?,?,?)");

            pstmt.setString(1,"호창씨");
            pstmt.setString(2,"이사");
            pstmt.setObject(3,20240830);
            pstmt.setObject(4,20240909);

            pstmt.executeUpdate();

        }catch (Exception e){

            e.printStackTrace();
            System.out.println("오류출력");
        }

    }

    public void select(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("SELECT* FROM staff");

            rs = pstmt.executeQuery();

            while (rs.next()){

                System.out.println("""
                                
                                s_id = %d
                                s_name = %s
                                s_rank = %s
                                s_startdate = %s
                                s_enddate = %s
                                """.formatted(
                        rs.getInt("s_id"),
                        rs.getString("s_name"),
                        rs.getString("s_rank"),
                        rs.getObject("s_startdate"),
                        rs.getObject("s_enddate")
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }

    }

    public void delete(){

        try{

            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("DELETE FROM staff where s_id = ?");

            int s_id = Integer.parseInt(JOptionPane.showInputDialog("s_id") );
            pstmt.setInt(1,s_id);

            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }

    public void update(){

        try{

            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("UPDATE staff SET s_name=?, s_rank=?,s_startdate=?, s_enddate=? WHERE s_id=?");


            String s_name = JOptionPane.showInputDialog("직원이름");
            pstmt.setString(1,s_name);

            String s_rank = JOptionPane.showInputDialog("직급");
            pstmt.setString(2,s_rank);

            String s_startdate = JOptionPane.showInputDialog("입사일(YYYYMMDD)");
            pstmt.setObject(3,s_startdate);

            String s_enddate = JOptionPane.showInputDialog("퇴사일(YYYYMMDD)");
            pstmt.setObject(4,s_enddate);

            int s_id = Integer.parseInt(JOptionPane.showInputDialog("s_id(키)"));
            pstmt.setInt(5,s_id);

            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }


    }

}
