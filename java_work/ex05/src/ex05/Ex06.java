package ex05;

public class Ex06 {

	public static void main(String[] args) {

		// 3과 4의 최소공배수

		// break -> switch / while / for 탈출

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println("i = " + i);
				break;
			}
		}

		int j = 1;
		boolean b = false;

		while (j < 100) {
			if (j % 3 == 0 && j % 4 == 0) {
				b = true;
				break;
			}
			j++;
		}

		System.out.println("j = " + j);

	}

}
