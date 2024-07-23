import java.util.Scanner;

public class A09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("price : ");
        int price = sc.nextInt();

        int answer = 0;

        if(price >= 100000){
            answer = (int) (price - price * 0.05);
        }
        else if(price >= 300000){
            answer = (int) (price - price * 0.1);
        }
        else{
            answer = (int) (price - price * 0.2);
        }

    }

}
