package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Hw02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("행을 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("열을 입력하세요 : ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];



        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] += (int) (Math.random()*10 + 1);

            }
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();

        System.out.print("증가 시킬 값을 입력하세요 : ");
        int d= sc.nextInt();

        addTwoDArr(arr, d);

    }

    public static void addOneDArr(int[] arr, int d){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + d;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void addTwoDArr(int[][] arr, int d){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = arr[i][j] + d;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();

//        addOneDArr(arr[0], 7);

        Scanner sc = new Scanner(System.in);

        System.out.print("증가 시킬 값을 입력하세요 : ");
        int e = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            addOneDArr(arr[i], e);
        }
    }

}
