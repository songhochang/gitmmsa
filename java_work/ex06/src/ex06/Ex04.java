package ex06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("프로그램시작");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호출하고 싶은 구구단을 입력하세요 : ");
		int a = sc.nextInt();
		
		aa(a);
		
		System.out.print("최소공배수를 구하고 싶은 두 수를 입력하세요 : ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		bb(b, c);
		
		System.out.println("프로그램끝");
				
	}
	//보냈는 구구단 호출하는 매서드	
	private static void aa(int dan) {
		for(int i = 1; i <10; i++) {
			System.out.println(dan + " * " + i + " = " +dan * i);
		}
	}
	
	//두수를 받아 최소 공배수 구하는 매서드
	private static void bb(int i, int j) {
		int num = 0;
		while (num < 50) {
			num++;
			if(num % i == 0 && num % j == 0) {
				System.out.println("최소공배수 = " + num);
				break;
			}
			
		}
	}
	
}
