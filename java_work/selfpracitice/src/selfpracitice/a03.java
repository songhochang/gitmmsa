package selfpracitice;

import java.util.Scanner;

public class a03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int [] arr = new int[a];
		
		for(int i = 0; i < a; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}

}
