package Hw;

public class Hw01 {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int sum = 0;
        int average = 0;

        for(int e : a){
            sum = sum + e;
            average = sum / a.length;
        }

        System.out.println(sum);
        System.out.println(average);

    }

}
