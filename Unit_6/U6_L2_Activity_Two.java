package Unit_6;

public class U6_L2_Activity_Two {

    public static int numEven(int[] array) {
        int evens = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }
}
