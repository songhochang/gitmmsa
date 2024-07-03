package ex04;

public class Hw04 {

	public static void main(String[] args) {
		
		int F = 100;
		float C =(float) ((int)((float)5/9 * ((float)F-32)*100.0)/100.0);
		System.out.println("F = " + F);
		System.out.println("C = " + C);
		
		int f = 100;
		float c = (float) ((f - 32) / 1.8);
		
//		System.out.println("c = " + Math.round());
		System.out.println(c);
		System.out.println(c*100);
		System.out.println((int)c*100);
		System.out.println((int)(c*100));
		System.out.println((int)(c*100)/100);
		System.out.println((float)(int)(c*100)/100);
		
	}
	
}
