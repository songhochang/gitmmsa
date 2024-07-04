package ex06;

/* 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
 1+(1+2)+(1+2+3)....... (1+2+3+4+5+6+7+8+9+10)의 결과
 1+(-2)+3+(-4)+....와 같은 식으로 계속 더해나갔을떄 ,몇까지 더해야 총합이 100이상이 되는지 구하시오
 for문을 while문으로 변경
 함수호출로 변경
*/

public class Hw01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int n1 = 2, n2 = 3;
		
		for(int i = 1; i < 20; i++) {
			if(i % n1 != 0 && i % n2 != 0) {
				sum = sum + i;
				System.out.println(i);
			}
			
		}
		
		
		System.out.println("2또는 3의 배수가 아닌 수의 총합은 " + sum + "입니다.");
		
//		int sum1 = 0;
//		int n11 = 2, n22 = 3;
//		
//		for(int i = 1; i < 20; i++) {
//			if(i % n11 != 0 || i % n22 != 0) {
//				sum1 = sum1 + i;
//				System.out.println(i);
//			}
//			
//		}
//		
//		
//		System.out.println("2또는 3의 배수가 아닌 수의 총합은 " + sum1 + "입니다.");
		
	}
	
}
