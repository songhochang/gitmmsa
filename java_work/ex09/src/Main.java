import java.util.Scanner;

import aa.bb.Fact;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();

        Fact fact1 = new Fact();
        int retValue = fact1.aa(n);

        n = fact1.aa(5);

        System.out.println("result = " + n);
        System.out.println("retValue = " + retValue);

    }

}
