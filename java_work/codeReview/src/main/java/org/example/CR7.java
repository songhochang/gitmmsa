package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CR7 {

    public static void main(String[] args) {

        int[] userarr = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < userarr.length; i++){
            System.out.print("1 ~ 100 사이의 숫자를 입력하세요 : ");
            int usernums = sc.nextInt();
            userarr[i] = usernums;
            if(usernums > 100 || usernums < 0){
                System.out.println("1 ~ 100 사이의 숫자만 입력해주세요");
                i--;
            }
        }

        Arrays.sort(userarr);

        System.out.print("입력한 숫자는 ");
        System.out.println(Arrays.toString(userarr));

        int[] randarr = new int[10];

        for(int i = 0; i < randarr.length; i++){
            randarr[i] = (int) (Math.random()*100) + 1;
            for(int j = 0; j < i; j++){
                if(randarr[i] == randarr[j]){
                    i--;
                }
            }
        }
        Arrays.sort(randarr);

        System.out.println(Arrays.toString(randarr));

        int count = 0;

        for(int i = 0; i < userarr.length; i++){
            for(int j = 0; j < randarr.length; j++){
                if(userarr[i] == randarr[j]){
                    count++;
                }
            }
        }

        System.out.println("맟춘 개수 : " + count);

    }

}
