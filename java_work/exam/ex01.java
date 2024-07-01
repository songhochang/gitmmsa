import java.util.Scanner;

/**
 * ex01
 */
public class ex01 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    int i = (int) (a * 100);
    System.out.println(i/(double)100);

  }

}