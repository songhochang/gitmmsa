package org.example.aa;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
//@AllArgsConstructor

public class Student {

    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(){

    }

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", kor=" + kor +
//                ", eng=" + eng +
//                ", math=" + math +
//                '}';
//    }

    public void getTotal(){
        int total = kor + eng + math;
        System.out.println(name + " 점수의 총합 : " + total);
    }

    public void getAverage(){
        float average = (float) Math.round((float) (kor + eng + math) / 3 * 10) / 10;
//        float round_average = (float) Math.round(average * 10) / 10;
        System.out.println(name + " 점수의 평균 : " + average);
    }


}
