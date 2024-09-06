package org.example;

interface Printable{
    void print();
}

class Print1 implements Printable{
    @Override
    public void print() {
        System.out.println("...???");
    }
}

public class Printer {

    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("익명 익터페이스");
            }
        };

        Printable plamda = ()-> System.out.println("람다");
        plamda.print();

    }

}
