package ex06;

public class Ex03 {
	private static void hiEveryone(int age) {

		System.out.println("작동중........." + age);
		if (age == 12) {
			System.out.println("age = " + age + "입니다");
		}

		for (int k = 0; k < 3; k++) {
			System.out.println("k = " + k);
		}

	}

	public static void main(String[] args) {
		int k = 20;
		System.out.println("@@@프로그램 시작@@@" + k);
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("@@@프로그램 끝@@@");

	}

}
