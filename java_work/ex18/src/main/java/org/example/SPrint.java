package org.example;

public class SPrint implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("Samsung Printer");
        System.out.println(doc);
    }
    @Override
    public void doA() {

    }
}
