package org.example;

import java.util.Arrays;

public class Ex04 {

    public static void main(String[] args) {

        int order = 3;
        int answer = 0;

        int length = (int)(Math.log10(order)+1);

        if(length == 1){
            if(order % 3 == 0){
                answer = 1;
            }
        }
        else{
            int k = 1;

            for(int i = 1; i < length; i++){
                k = k * 10;
            }

            for(int i = 1; i < length; i++){
                if(order % 3 == 0){
                    answer = answer + 1;
                }
                order = order - (order / k * k);
                k = k / 10;
            }
        }

        System.out.println(answer);

    }

}
