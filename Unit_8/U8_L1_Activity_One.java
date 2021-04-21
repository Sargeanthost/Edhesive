package Unit_8;

public class U8_L1_Activity_One {

    public static int diagSum(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > arr[0].length - 1) {
                break;
            }
            sum += arr[i][i];
        }
        return sum;
    }
}
