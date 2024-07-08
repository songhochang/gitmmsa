import java.util.Scanner;

public class Hw04 {

    public static void main(String[] args) {

        System.out.print("정수 두개를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        int answer = Integer.MAX_VALUE;
        int answer = 0;
        if(a > b){
            for(int i = 1; i <= b; i++){

                if(a % i == 0 && b % i ==0){
                    answer = i;
                }

            }

            System.out.println(answer);
        }

        if(b > a){
            for(int i = 1; i <= a; i++){

                if(a % i == 0 && b % i ==0){
                    answer = i;
                }

            }

            System.out.println(answer);
        }

    }

}
