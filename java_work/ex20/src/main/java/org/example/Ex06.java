package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex06 {

    public static void main(String[] args) {

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa", "root", "1234");

            System.out.println("가능?");

            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO student values ('김길동','100','100','100')");

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
