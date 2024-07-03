package ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(true) {
			i++;
			System.out.println("i = " + i);
			if(i == 3)
				continue; // 다음 실행하지 않고 처음으로 돌아감
			
			int j = sc.nextInt();
			System.out.println("j = " + j);
		}
		
//		System.out.println("종료됩니다");
		
	}
	
}
