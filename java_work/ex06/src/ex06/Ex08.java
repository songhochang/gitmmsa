package ex06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("곱하고 싶은 값 입력 : ");
			int input = sc.nextInt();
			System.out.println(doA(input));
		}
		
	}
	
	public static int doA(int n) {
		return n * n;
	}
	
}
