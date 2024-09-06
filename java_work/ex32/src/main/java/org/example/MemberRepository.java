package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    public void select(){

    }

    public void insert(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pj_test","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("Insert INTO Book (b_name,b_type,publisher,state) VALUES ('하기싫다','시','아아','대기중')");
            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
