package ex05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
				
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int n = sc.nextInt();
			System.out.println("n = " + n);
			
			if(n == 0) break; // break -> while / switch 탈출
		}
		
		System.out.println("종료됩니다");
		
	}
	
}
