package ex02;

public class Ex03 {
	
	public static void main(String[] args) {
		
		double num1, num2;
		num1 = 1.000001;
		num2 = 2.000002;
		
		System.out.println(num1 + num2);
		
		double r;
		r = num1 + num2;
		
		System.out.println(r);
		
		int a = 10; // java는 대소문자 구별
		int A = 20; //$ , _ 외의 특수문자, keyword는 변수 이름 사용 못함
		
		System.out.println(a);
		System.out.println(A);
		
	}

}
