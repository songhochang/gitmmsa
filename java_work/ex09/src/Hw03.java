public class Hw03 {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 4; j++) {
                System.out.print(j + " X " + i + " = " + i * j + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            for (int j = 5; j <= 7; j++) {
                System.out.print(j + " X " + i + " = " + i * j + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            for (int j = 8; j <= 9; j++) {
                System.out.print(j + " X " + i + " = " + i * j + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();


        for (int i = 2; i < 9; i = i + 3) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int s = i + k;
                    if (s > 9) {
                        break;
                    }
                    System.out.print(s + " X " + j + " = " + s * j + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
