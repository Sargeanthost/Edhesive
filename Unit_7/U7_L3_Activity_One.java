package Unit_7;

import java.util.ArrayList;

public class U7_L3_Activity_One {
    public static void shiftRight(ArrayList<String> list) {
        list.add(0, list.remove(list.size() - 1));
    }
}
