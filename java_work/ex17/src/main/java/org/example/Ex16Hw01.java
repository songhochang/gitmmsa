package org.example;

public class Ex16Hw01 {

    public static int minValue(int[] arr){

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min= arr[i];
            }
        }

        return min;
    }

    public static int maxValue(int[] arr){

        int max = arr[0];

        for(int e : arr){

            if(e > max){
                max = e;
            }

        }

        return max;
    }

    public static void main(String[] args){

        int[] arr = {10, 20, 5, 9, 35, 100};

        System.out.println("최솟값 : " + minValue(arr));
        System.out.println("최댓값 : " + maxValue(arr));

    }

}
