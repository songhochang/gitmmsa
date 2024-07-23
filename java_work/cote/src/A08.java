import java.util.Scanner;

public class A08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        String a = sc.next();
        System.out.print("b : ");
        String b = sc.next();

        int sum = 0;

        if(a.equals("0")){
            sum = Integer.parseInt(b);
        }
        else if(b.equals("0")){
            sum = Integer.parseInt(a);
        }
        else if(a.equals("0") && b.equals("0")){
            sum = 0;
        }
        else{
            sum = Integer.parseInt(a) + Integer.parseInt(b);
        }


        String answer = String.valueOf(sum);

        System.out.println(answer);

    }

}
