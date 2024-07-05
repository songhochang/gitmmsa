import java.util.Scanner;

public class DD {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("몇까지 더할까요 : ");
        int input = sc.nextInt();

        doA(input);
        doB(input);

    }

    public static void doA(int end){

        int sum = 0;
        for(int i = 1; i <= end; i++){
            sum += i;
        }

        System.out.println("1부터 " + end + "까지 더한 수는 " + sum + "입니다.");
    }

    public static void doB(int end){
        int sum = 1;
        for(int i = 1; i <= end; i++){
            sum = sum * i;
        }

        System.out.println("1부터 " + end + "까지 곱한 수는 " + sum + "입니다.");
    }

}
