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
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM entry");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println("e_id = " + rs.getInt("e_id") + " | " + "insertdate = " + rs.getDate("insertdate") + " | " + "updatedate = " + rs.getDate("updatedate") + " | " + "deletedate = " + rs.getDate("deletedate") + " | " + "etc = " + rs.getString("etc") + " | " + "s_id = " + rs.getInt("s_id") + " | " + "b_id = " + rs.getInt("b_id") + " | " + "state = " + rs.getString("state"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
