package ex03;

import java.util.Scanner;

public class Hw0701 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
//		double b = Math.round(a * 100.0) / 100.0; 반올림
//		double b = Math.ceil(a * 100.0) / 100.0; 올림
		double b = Math.floor(a * 100.0) / 100.0;
		
		System.out.println(b);
		
		float c = (float) a;
		System.out.println(c);
		
	}

}
