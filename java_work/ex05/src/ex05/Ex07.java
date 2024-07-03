package ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int n = 0;
		
		while((n++) < 100) {
			
			if(n % 5 != 0 || n % 7 != 0) {
				continue;
			}
			else {
				System.out.println(n);
				break;
			}
			
//			if(n % 5 != 0) {
//				continue;
//			}
//			System.out.println(n);
			
		}
		
	}
	
}
