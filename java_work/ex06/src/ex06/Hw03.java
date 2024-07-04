package ex06;

//1+(-2)+3+(-4)+....와 같은 식으로 계속 더해나갔을떄 ,몇까지 더해야 총합이 100이상이 되는지 구하시오

public class Hw03 {

	public static void main(String[] args) {
		
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
		System.out.println("1+(-2)+3+(-4)+....와 같은 식으로 계속 더해나갔을떄 " + i + "까지 더해야 총합이 100이상이 된다");
	}
	
}
