package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBRepository {

    // 1. insert
    // 2. select
    // 3. update
    // 4. delete

    // insert
    public void insert(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();

            // 1. mysql jar 추가확인
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. connection 연결
            Connection conn = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3307/aaa",
                            "root",
                            "1234");

            System.out.println("연결성공");

            // 3. sql문 작성
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO aa (name,age) VALUES (?,?)");
            pstmt.setString(1,name);
            pstmt.setInt(2,age);

            // 4. sql문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void select(){
        System.out.println("select해야함");
    }


}
