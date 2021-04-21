package Unit_7;

import java.util.ArrayList;

public class U7_L4_Activity_One {
    public static int countInitial(ArrayList<String> list, String letter) {
        int amount = 0;
        for (String s : list) {
            if (s.toUpperCase().startsWith(letter.toUpperCase())) {
                amount++;
            }
        }
        return amount;

    }
}
