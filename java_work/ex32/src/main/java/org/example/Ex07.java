package org.example;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Ex07 {

    private MemberRepository memberRepository = new MemberRepository();

    Ex07(){
        System.out.println("""
                1. select()
                2. insert()
                3. update()
                4. delete()
                """);

        Scanner scanner = new Scanner(System.in);
        int ra = scanner.nextInt();

        if(ra == 1){

        }

    }

    public static void main(String[] args) {

        new Ex07();

    }

}
