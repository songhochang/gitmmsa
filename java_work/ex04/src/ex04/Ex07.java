package ex04;

import java.util.Scanner;

//상황연산자

public class Ex07 {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 20;
//		String re = a > b ? "a는 b보다 큽니다." : "a는 b보다 작습니다.";
//		
//		System.out.println(re);
		
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		int j = sc.nextInt();
//		
//		String re1 = i > j ? "a는 b보다 큽니다." : "a는 b보다 작습니다.";
//		System.out.println(re1);
		
		int a = 10;
		int b = 20;
		
		String re = "";
		
		if(a > b) {
			re = "a는 b보다 큽니다";
		}
		else {
			re = "a는 b보다 작습니다";
		}
		
		System.out.println(re);
		
	}
	
}
