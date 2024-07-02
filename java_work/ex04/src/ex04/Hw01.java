package ex04;

public class Hw01 {
	
	public static void main(String[] args) {
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
		
		System.out.println("필요한 바구니의 개수는 " + numOfBucket + "개입니다.");
		
		int noa = 145;
		int sob = 10;
		int nob;
		
		if(noa % sob == 0) {
			nob = noa / sob;
		}
		else {
			nob = noa / sob + 1;
		}
		
		System.out.println(nob);
	}

}
