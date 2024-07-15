package Hw;

import java.util.Scanner;
class A {

}
public class Hw04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        char d;
//        int a = 1;

        for(int i = 0 ; i < c.length/2; i++){
            d = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = d;
        }

        System.out.println(new String(c));

    }

}
