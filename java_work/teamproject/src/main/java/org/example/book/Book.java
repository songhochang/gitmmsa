package org.example.book;

import java.sql.*;
import java.util.Scanner;

public class Book {

    private int B_id;
    private String B_name;
    private String B_type;
    private String publisher;
    private String country;

    @Override
    public String toString() {
//        String temp = mydate==null? "" : DateTimeFormatter.ofPattern("yyyy/mm/dd");
        return "SKLL_library{" +
                "B_id=" + B_id +
                ", B_name='" + B_name + '\'' +
                ", B_type='" + B_type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", c_id" + country +
                '}';
    }

    public Book(int b_id, String b_name, String b_type, String publisher, String country) {
        this.B_id = b_id;
        this.B_name = b_name;
        this.B_type = b_type;
        this.publisher = publisher;
        this.country = country;
    }

}
