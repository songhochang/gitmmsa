package ex03;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		//무언가르 입력받아서 사용할때 쓰는 함수
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세요");
		a = sc.nextInt();
		System.out.println("b를 입력하세요");
		b = sc.nextInt();
		System.out.println("a = " + a + "\nb = " + b);
		System.out.println("a + b = " + (int)(a + b));
	}

}
