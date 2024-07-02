package selfpracitice;

public class a02 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		for(int i = 0; i <arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.println(arr1[i]);
		}
		
		for(int j = 0; j < arr2.length; j++) {
			arr2[j] = 10 - j;
			System.out.println(arr2[j]);
		}
		
	}
	
}
