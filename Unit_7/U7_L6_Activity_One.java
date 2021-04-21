package Unit_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U7_L6_Activity_One {

    public static void sortAndPrint(String[] arr) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        for (int i = 1; i < list.size(); i++) {
            String toInsert = list.get(i);
            int j;

            for (j = i; j > 0; j--) {

                if (toInsert.compareTo(list.get(j - 1)) >= 0) {
                    break;
                }

            }

            list.add(j, list.remove(i));
            print(list);
        }
    }

    private static void print(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
