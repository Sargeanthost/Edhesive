package Unit_7;

import java.util.ArrayList;

public class U7_L5_Activity_Two {

    public static void selectSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (list.get(j) < list.get(min_idx))
                    min_idx = j;

            int temp = list.get(min_idx);
            list.set(min_idx, list.get(i));
            list.set(i, temp);
        }
    }
}
