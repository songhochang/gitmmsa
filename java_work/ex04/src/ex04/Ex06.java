package ex04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int i = sc.nextInt();
		
		if(i<10) {
			System.out.println("10 미만");
		}
		
		else if(i <= 20) {
			System.out.println("10이상 20이하");
		}
		
		else {
			System.out.println("20초과");
		}
		
	}
	
}
