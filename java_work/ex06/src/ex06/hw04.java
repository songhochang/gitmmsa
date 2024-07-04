package ex06;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {

		while (true) {
			System.out.print("1 ~ 3 중에서 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			if (input == 1) {
				aa();
			} 
			
			else if (input == 2) {
				bb();
			} 
			
			else if (input == 3){
				cc();
			}
			
			else {
				System.out.println("1 / 2 / 3 중에서 입력하세요");
			}
			continue;
		}

	}

	public static void aa() {

		int sum = 0;
		int n1 = 2, n2 = 3;

		for (int i = 1; i < 20; i++) {
			if (i % n1 != 0 && i % n2 != 0) {
				sum = sum + i;
			}

		}

		System.out.println("2또는 3의 배수가 아닌 수의 총합은 " + sum + "입니다.");

	}

	public static void bb() {

		int sj = 0;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				sj = sj + j;
			}
		}

		System.out.println("1+(1+2)+(1+2+3)....... (1+2+3+4+5+6+7+8+9+10)의 결과는 " + sj + "입니다");

	}

	public static void cc() {
		
		int sum1 = 0;
		int sum2 = 0;
		int result = 0;
		int i = 1;
		
		for(; ; i++) {
			if(i % 2 != 0) {
				sum1 = sum1 + i;
			}
			else {
				sum2 = sum2 - i;
			}
			
			result = sum1 + sum2;
			if(result >= 100) {
				break;
			}
		}
		System.out.println(i);

	}

}
