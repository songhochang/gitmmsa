package ex04;

public class Ex03 {

	public static void main(String[] args) {
		
		int i1 = 10;
		
		/*
		 * 브레이크포인트 더블클릭
		 * 벌레모양으로 디버그 실행
		 * f6 한줄씩 진행
		 * f8 종료
		 */
		
		//i++ & i = i + 1 & i += 1
		
		System.out.println(i1++); // 출력 후 증가 10출력 후 11저장
		System.out.println(++i1); // 증가후 출력 12로 증가 후 12출력
		System.out.println(i1);
		
		System.out.println(i1--); // 출력 후 증가 10출력 후 11저장
		System.out.println(--i1); // 증가후 출력 12로 증가 후 12출력
		System.out.println(i1);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("zzz");
			System.out.println(i+i);
		}
		
		for(int j = 0; j < 10; j++) {
			i1 = i1 + j;
		}
		System.out.println(i1);
	}
	
}
