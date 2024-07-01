package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//두수를 입력받아 곱을 구하고 나누어서 몫과 나머지를 구하시오...
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b= sc.nextInt();
		
		System.out.println(a + " * " + b + " = " + a * b);
		System.out.println(a + " / " + b + " = " + a / b);
		System.out.println(a + " % " + b + " = " + a % b);
		
		System.out.println("곱셈의 값은  " + a * b + "입니다.");
		System.out.println("나눗셈의 몫은 " + a / b + "이고 나머지는 " + a % b + "입니다.");
	}
	
}
