package ex06;

public class Hw01w {
	
	public static void main(String[] args) {
		
		int i = 1;
		int n1 = 2, n2 = 3;
		int sum = 0;
		
		while(i < 20) {
			
			if(i % n1 != 0 && i % n2 != 0) {
				sum = sum + i;
			}
			i++;
		}
		
		System.out.println("2또는 3의 배수가 아닌 수의 총합은 " + sum + "입니다.");
		
	}

}
