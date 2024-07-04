package ex06;

// 1+(1+2)+(1+2+3)....... (1+2+3+4+5+6+7+8+9+10)의 결과

public class Hw02 {
	
	public static void main(String[] args) {
		
		int sj = 0;
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				sj = sj + j;
			}
		}
		
		System.out.println("1+(1+2)+(1+2+3)....... (1+2+3+4+5+6+7+8+9+10)의 결과는 " + sj + "입니다");
		
	}

}
