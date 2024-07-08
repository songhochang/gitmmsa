import java.util.Scanner;

public class Hw02 {

    public static void main(String[] args){

        int hour = 0, minute = 0, second = 0;


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a < 60){
            System.out.println("[0, 0, " + a + "]");
        } else if (a < 3600) {
            System.out.println("[0, " + a / 60 + ", " + a % 60 + "]");
        }
        else {
            hour = a / 3600;
            a = a % 3600;
            minute = a / 60;
            a = a % 60;
            second = a;
            System.out.println("[" + hour + ", " + minute + ", " + second + "]" );
        }


    }

}
