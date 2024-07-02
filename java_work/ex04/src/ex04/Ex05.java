package ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int i1, i2;
		
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		
		if(i1 > i2) {
			System.out.println(i1 + "이/가 " + i2 + "보다 크다");
		}
		
		else if(i1 == i2) {
			System.out.println(i1 + "와/과 " + i2 + "는 같다");
		}
		
		else {
			System.out.println(i2 + "이/가 " + i1 + "보다 크다");
		}
		
	}
	
}
