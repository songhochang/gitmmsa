package aa;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// byte - short - int cpu 32비트 4byte
		// int 4byte 32bit
		// shotr 2byte 16bit
		
		// 0000 0000 0000 0000 16개
		// 0000 0000 0000 0000 0000 0000 0000 0000 32개
		// 10진수 10000
		// 10진수 000 <- 10000 X
		
		short n1 = 11;
		short n2 = 22;
		
		// short r = n1 + n2; X 여기서 n1, n2는 int형으로 계산해서 short형 r X
		short r = (short) (n1 + n2);
		
		System.out.println(n1 + n2);
		System.out.println(r);
		
	}

}
