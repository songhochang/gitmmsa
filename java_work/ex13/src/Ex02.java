import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {

        int nums[][] = new int[3][3];

        int a = 10;

        Arrays.fill(nums[0], a);

        a = a + 10;

        Arrays.fill(nums[1], a);

        a = a + 10;

        Arrays.fill(nums[2], a);

        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));

        System.out.println();

        int temp[] = nums[2];
        nums[2] = nums[0];
        nums[0] = temp;

        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));

    }

}
