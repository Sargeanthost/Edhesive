package Unit_7;

import java.util.ArrayList;

//only gets 80% but works
public class U7_L3_Activity_Two {

    public static void printStatistics(ArrayList<Integer> list) {
        boolean isMode = false;

        System.out.println("Sum: " + list.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Average: " + list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());

        ArrayList<Integer> list2 = new ArrayList<>();

        int mode = 0, modeRecord = 0;

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && (list.get(i) != mode || modeRecord == 0)) {
                    count++;
                }
            }

            if (count > modeRecord) {
                modeRecord = count;
                mode = list.get(i);
                isMode = true;
            } else if (count == modeRecord) {
                // prevents mode if there are numbers of same occurance, eg mode being 1 where
                // array is {1,1,2,2}
                isMode = false;
            }
        }
        System.out.println(isMode ? "Mode: " + mode : "Mode: no single mode");
    }
}