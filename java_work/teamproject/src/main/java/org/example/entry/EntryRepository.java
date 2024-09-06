package org.example.entry;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class EntryRepository {

    private LocalDate insertdate;
    private LocalDate updatedate;
    private LocalDate deletedate;
    private String etc;
    private String state;
    private int s_id;
    private int b_id;

    public void insert(LocalDate insertdate, String etc, String state, int s_id, int b_id){

        this.insertdate = insertdate;
        this.etc = etc;
        this.state = state;
        this.s_id = s_id;
        this.b_id = b_id;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SKLL_Library","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO entry (insertdate,etc,state,s_id,b_id) VALUES (?,?,?,?,?)");
            pstmt.setDate(1, Date.valueOf(insertdate));
            pstmt.setString(2,etc);
            pstmt.setString(3,state);
            pstmt.setInt(4,s_id);
            pstmt.setInt(5,b_id);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
