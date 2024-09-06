package org.example;

import org.example.components.CC;

public class Ex02 {

    public static void main(String[] args) {

        CC cc = CC.getInstance();
        System.out.println(cc);

        CC cc2 = CC.getInstance();
        System.out.println(cc2);

        System.out.println(cc==cc2);

    }

}
