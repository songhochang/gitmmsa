import java.util.Scanner;

public class ABC {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();

        if(s.equals("+")){
            int result = doA(a, b);
            System.out.println(result);
        }
        else if(s.equals("-")){
            int result = doB(a, b);
            System.out.println(result);
        }
        else if(s.equals("*")){
            int result = doC(a, b);
            System.out.println(result);
        }
        else if(s.equals("/")){
            if(b == 0){
                System.out.println("계산 불가");
                return ;
            }

            int result = doD(a, b);
            System.out.println(result);

        }


    }

    public static int doA(int a, int b){
        return a + b;
    }

    public static int doB(int a, int b){
        return a - b;
    }

    public static int doC(int a, int b){
        return a * b;
    }

    public static int doD(int a, int b){
        return a / b;
    }
}
