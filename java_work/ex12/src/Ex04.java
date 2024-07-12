

public class Ex04 {
//기본생성자, toString() 생략

    Ex04(){
        int ar[] = {10, 20, 30, 40, 50};

        doA(ar);

        int br[] = makeary(10);

        System.out.println(br.length);
    }

    public void doA(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }

    public int[] makeary(int len){
        return new int[len];
    }

    public static void main(String[] args) {

    Ex04 ex04 = new Ex04();

    }

}
