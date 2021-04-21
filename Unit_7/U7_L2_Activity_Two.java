package Unit_7;

import java.util.ArrayList;

public class U7_L2_Activity_Two {

    public static double average(ArrayList<Double> list) {
        double average = 0;
        for (Double d : list) {
            average += d;
        }

        return average / list.size();
    }
}
