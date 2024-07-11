import java.util.Scanner;

class Fact{
    public int fact(int num){
        System.out.println("여기오나 " + num);

        if(num>0){
            return 2 * fact(num - 1);
        }
        else{
            return 1;
        }
    }
}

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("몇승 구할래? ");

        String a = sc.nextLine();
        int n = Integer.parseInt(a);


        Fact fact = new Fact();
        int re = fact.fact(n);
        System.out.println(re);

    }
}
