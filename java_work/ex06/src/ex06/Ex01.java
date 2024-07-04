package ex06;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 *  i = 0일때 j = 0 ~ 2까지
		 *  i = 1일때 j = 0 ~ 2까지
		 *  i = 2일때 j = 0 ~ 2까지
		 * */
				
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("[i, j] = " + "[" + i + ", " + j + "]");
			}
		}
		
	}
	
}
