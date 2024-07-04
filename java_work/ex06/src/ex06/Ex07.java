package ex06;

public class Ex07 {
	
	public static void main(String[] args) {
		int ma = doA(3);
		System.out.println(ma);
		String ms = doB("ㅋ");
		System.out.println(ms);
		
		System.out.println(doA(3));
		System.out.println(doB("ㅋ"));
	}

	public static int doA(int a) {
		return a * a;
	}
	
	public static String doB(String s) {
		return s + s;
	}
	
}
