package org.example;

import org.example.aa.Student;

public class Main {

    Main(){
        Student st = new Student("고길동", 90, 80, 60);
        System.out.println(st);
        st.getTotal();
        st.getAverage();
    }

    public static void main(String[] args) {

        new Main();

    }

}