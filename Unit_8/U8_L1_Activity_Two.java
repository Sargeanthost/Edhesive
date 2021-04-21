package Unit_8;

public class U8_L1_Activity_Two {
    public static int[][] multTable(int row, int column) {

        int[][] a = new int[row][column];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j;
            }
        }

        return a;
    }

}
