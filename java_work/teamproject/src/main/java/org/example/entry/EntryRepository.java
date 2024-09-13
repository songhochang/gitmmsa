package org.example.entry;

import java.sql.*;
import java.time.LocalDate;

public class EntryRepository {

    private String etc;
    private String state;
    private int s_id;
    private int b_id;

    public void insert(String etc, String state, int s_id, int b_id){

        this.etc = etc;
        this.state = state;
        this.s_id = s_id;
        this.b_id = b_id;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO entry (insertdate,etc,state,s_id,b_id) VALUES (?,?,?,?,?)");
            pstmt.setDate(1, Date.valueOf(LocalDate.now()));
            pstmt.setString(2,etc);
            pstmt.setString(3,state);
            pstmt.setInt(4,s_id);
            pstmt.setInt(5,b_id);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void update(String etc, String state, int s_id, int b_id){

        this.etc = etc;
        this.state = state;
        this.s_id = s_id;
        this.b_id = b_id;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("UPDATE entry SET updatedate=?,etc=?,state=? WHERE s_id=? AND b_id=?");
            pstmt.setDate(1,Date.valueOf(LocalDate.now()));
            pstmt.setString(2, etc);
            pstmt.setString(3, state);
            pstmt.setInt(4, s_id);
            pstmt.setInt(5, b_id);

            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void delete(String etc, String state, int s_id, int b_id){
        this.etc = etc;
        this.state = state;
        this.s_id = s_id;
        this.b_id = b_id;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("UPDATE entry SET deletedate=?,etc=?,state=? WHERE s_id=? AND b_id=?");
            pstmt.setDate(1,Date.valueOf(LocalDate.now()));
            pstmt.setString(2, etc);
            pstmt.setString(3, state);
            pstmt.setInt(4, s_id);
            pstmt.setInt(5, b_id);

            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void select(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM entry");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println("관리번호 = " + rs.getInt("e_id") + " | " + "입고일 = " + rs.getDate("insertdate") + " | " + "수정일 = " + rs.getDate("updatedate") + " | " + "파기일 = " + rs.getDate("deletedate") + " | " + "기타 = " + rs.getString("etc") + " | " + "등록 직원 = " + rs.getInt("s_id") + " | " + "책 번호 = " + rs.getInt("b_id") + " | " + "대출가능여부 = " + rs.getString("state"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
