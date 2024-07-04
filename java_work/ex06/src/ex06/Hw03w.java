package ex06;

public class Hw03w {
	
	public static void main(String[] args) {
		
		int i = 1;
		int sum1 = 0, sum2 = 0;
		int sum;
		
		while(true) {
			if (i % 2 != 0) {
				sum1 = sum1 + i;
			}
			else {
				sum2 = sum2 - i;
			}
			sum = sum1 + sum2;
			if(sum >= 100) {
				System.out.println(i);
				break;
			}
//			i++;
			else {
				i++;
				continue;
			}
		}
		
	}

}
