package ex03;

import java.util.Scanner;

public class Ex07_sc {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		if (a == b) {
//			
//			System.out.println("같습니다.");
//			
//		}
//		else {
//			
//			System.out.println("다릅니다");
//			
//		}
		
		if (a < b) {
			System.out.println("a가 b보다 작습니다");
		}
		else if(a > b) {
			System.out.println("a가 b보다 큽니다");
		}
		else {
			System.out.println("a와 b가 같습니다");
		}
		
	}

}
