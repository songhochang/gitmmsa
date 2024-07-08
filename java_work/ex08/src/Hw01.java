import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(doA(a));


    }

    public static int doA(int n){

        if(n == 0){
            return 1;
        }
        else{
            return 2 * doA(n -1);
        }

    }

}
