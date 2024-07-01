package aa;

public class Ex07 {
	
	public static void main(String[] args) {
		
		final int MAX_SIZE = 100;
		System.out.println(MAX_SIZE);
		
//		MAX_SIZE = 200; 불가능
		
		final double AA = 200.00003;
		System.out.println(AA);
		
		final String c = "변경불가";
		System.out.println(c);
		
//		float result = 3.3 + 4.5; 
		float resultf = (float) (3.3 + 4.5); // 3.3, 4.5는 
		System.out.println(resultf);
		double resultd = 3.3 + 4.5;
		System.out.println(resultd);
		
		System.out.printf("정수는 %d 실수는 %f ", 10, 20.33);
		
		System.out.println(312381721872361823L);
		
		System.out.println(3.4*100000000);
		
	}

}
