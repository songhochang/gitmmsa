package ex04;

import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		
		int num = 12;
		System.out.println(num == 0 ? "0" : num > 0 ? "양수" : "음수");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력하세요 : ");
		
		int j = sc.nextInt();
		
		System.out.println((j > 0 ? "양수입니다" : j < 0 ? "음수입니다" : 0));
		
		if( num > 0) {
			System.out.println("양수입니다.");
		}
		else if( num < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
		
	}
	
}
