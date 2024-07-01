package ex03;

import java.util.Scanner;

public class Ex02_2 {

	public static void main(String[] args) {
		
		int h;
		int w;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요");
		h = sc.nextInt();
		System.out.println("길이를 입력하세요");
		w = sc.nextInt();
		System.out.println("사각형의 넓이는 " + h * w + "입니다");
		
	}
	
}
