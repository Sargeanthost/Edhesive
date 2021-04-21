package Unit_7;

import java.util.ArrayList;

public class U7_L2_Activity_Three {

    public static ArrayList<Integer> getOdds(ArrayList<Integer> vals) {
        ArrayList<Integer> odds = new ArrayList<>();

        for (Integer i : vals) {
            if (i % 2 == 1) {
                odds.add(i);
            }
        }

        return odds;
    }

}
