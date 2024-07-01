package ex03;

public class Ex04 {

	public static void main(String[] args) {
		
		//강제 형변환
		//int 4byte short 2byte
		//8bit = 1byte
		int i1 = 10;
		short s1 = (short) i1;
		
		//자동 형변환
		short s2 = 20;
		int i2 = s2;
		
		System.out.println(s1);
		
	}
	
}
