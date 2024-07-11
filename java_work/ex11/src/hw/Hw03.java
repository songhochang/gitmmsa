package hw;

import java.util.Scanner;

public class Hw03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        under(a);
        over(a);

    }

    public static void under(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] < a[j]){
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("오름차순 끝");
    }

    public static void over(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] > a[j]){
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("내림차순 끝");
    }

}
