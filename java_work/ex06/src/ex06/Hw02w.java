package ex06;

public class Hw02w {
	
	public static void main(String[] args) {
		
		int i = 1;
		int sumi = 0;
		int j = 1;
		int sumj = 0;
		
		while(i <= 10) {
			
			while(j <= i) {
				sumj = sumj + j;
				j++;
			}
			
			sumi = sumi + sumj;
			i++;
		}
		
		System.out.println("1+(1+2)+(1+2+3)....... (1+2+3+4+5+6+7+8+9+10)의 결과는 " + sumi + "입니다");
	}

}
