package ex03;

public class Ex09 {
	
	public static void main(String[] args) {
		
		short s1 = 10;
		s1 = (short) (s1 + 87L);
		
		System.out.println(s1);
		
		s1 = 10;
		s1 += 87L;
		
		System.out.println(s1);
		
		int i = 3;
		
		i = (int) (i * 3.3);
		System.out.println(i);
		
		i *= 3.3;
		System.out.println(i);
		
	}

}
