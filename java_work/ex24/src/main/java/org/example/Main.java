package org.example;

public class Main {
    public static void main(String[] args) {

        BoxFactory.<Integer>peekBox(new Box<>(10));
        BoxFactory.peekBox2(new Box<>(20));
        BoxFactory.peekBox2(new Box<>(12.3456));
//        BoxFactory.peekBox2(new Box<>("스트링 넣고 싶다"));

//        SteelBox<String> steelBox = new SteelBox<String>();
//        steelBox.setT("Test");
//
//        System.out.println(steelBox.getT());

    }
}