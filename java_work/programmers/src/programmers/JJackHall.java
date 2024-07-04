package programmers;

import java.util.Scanner;

public class JJackHall {
	
	public static void main(String[] args) {
		
		int [] num_list;
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		num_list = new int[count];
		int countj = 0;
		int counth = 0;
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] == 0) {
				countj = countj + 1;
			}
			else {
				counth = counth + 1;
			}
		}
		
//		int[] answer = {countj, counth};
		
		System.out.println(countj);
		System.out.println(counth);
	}

}
