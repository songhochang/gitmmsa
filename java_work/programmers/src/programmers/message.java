package programmers;

import java.util.Scanner;

public class message {

	public static void main(String[] args) {
		
		String message = "";
		Scanner sc = new Scanner(System.in);
		message = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < message.length(); i++) {
			count = i;
//			System.out.println(count);
		}
		
		System.out.println((count + 1) *2);
		
	}
	
}
