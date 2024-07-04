package ex06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		// 제어문
		// 1번을 입력 doA 함수
		// 2번을 입력 doB 함수

		System.out.println("1을 입력하면 doA함수가 2를 입력하면 doB함수가 출력됩니다");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		if(select == 1) {
			doA();
		}
		else if(select == 2) {
			doB();
		}
		else {
			System.out.println("1과 2중에 입력하세요");
		}

	}

	public static void doA() {

		System.out.println("doA");
		
	}

	public static void doB() {

		System.out.println("doB");
		
	}

}
