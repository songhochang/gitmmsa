package selfpracitice;

import java.util.Scanner;

public class a04 {

	public static void main(String[] args) {
		
		String[] fruit = {"사과", "귤", "포도", "참외", "배"};
		
		for(int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		
		String[] str = {"a", "b", "c", "d", "e"};
		
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int input = 0;
		
		for(int i = 0; i < in; i++) {
			input = i;
		}
		
		System.out.println(str[input]);
		
	}
	
}
