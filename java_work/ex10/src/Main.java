import aa.CalSecond;

public class Main {

    public static void main(String[] args) {

        CalSecond calSecond = new CalSecond();

        int retValue = calSecond.inputNumber();
        System.out.println(retValue);
//        System.out.println(calSecond.inputNumber());

        String resultValue = calSecond.calculate(retValue);
        System.out.println(resultValue);

    }

}
