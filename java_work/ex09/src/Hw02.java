public class Hw02 {

    //피보나치 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다 1 1 2 3 5 8 13 21 34 55 89

    public static void main(String[] args) {

        int start = 0;
        int next = 1;
        int sum = 0;
        int count = 0;

        for (int i = 1; ; i++) {
            sum = start + next;
            start = next;
            next = sum;
            count++;
            System.out.println(start);
            if(count == 10){
                System.out.println(count + "번째 수 = " + start);
                break;
            }
        }

    }


}
