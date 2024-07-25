package org.example;

public class Ex02 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point p1 = new Point(12,20);
        Point p2 = (Point) p1.clone();

        p1.showPoint();
        p2.showPoint();

        p1.setXpos(30);

        p1.showPoint();
        p2.showPoint();

    }

}
