package Hw;

import java.util.Scanner;

public class Hw03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int next = a;

        String b = "";

        while(next >= 1){
            int left = next % 2;
            b = b + left;
            System.out.println(left);
            next = next / 2;
        }
        System.out.println("-----");
//        for(int i = b.length()- 1; i >= 0; i--){
//            System.out.println(b.charAt(i));
//        }
        char[] c = b.toCharArray();

        for(int i = 0; i < c.length/2; i++){
            char d = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = d;
        }

        System.out.println(new String(c));

    }

}
