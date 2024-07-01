package ex03;

public class Ex11 {
	
	//html java ---> python ->>> c#
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 22;
		boolean result;
		
		result = 3 <= a && a <= 100;
		System.out.println(result);
		
		result = a % 3 == 0;
		System.out.println(result);
		
		result = a % 2 == 0;
		System.out.println(result);
		
		result = ((a % 3 == 0) && (a % 2 == 0)) || (b % 2 == 0);
		System.out.println(result);
		
	}

}
