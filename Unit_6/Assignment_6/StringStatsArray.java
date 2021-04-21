package Unit_6.Assignment_6;

import java.util.Arrays;
import java.util.List;

public class StringStatsArray {

    private final String[] strings;

    public StringStatsArray(String[] a) {
        strings = a;
    }

    public String toString() {
        String contents = "";
        for (int i = 0; i < strings.length - 1; i++) {
            contents += "\"" + strings[i] + "\", ";
        }
        return "{" + contents + "\"" + strings[strings.length - 1] + "\"}";
    }

    public double averageLength() {
        double total = 0;
        for (String s : strings) {
            total += s.length();
        }
        return total / strings.length;
    }

    public int search(String s) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public int sortStatus() {

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].compareToIgnoreCase(strings[i - 1]) < 0) {
                ascending = false;
                break;
            }
        }

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].compareToIgnoreCase(strings[i - 1]) > 0) {
                descending = false;
                break;
            }
        }

        if (ascending == true) {
            return 1;
        } else if (descending == true) {
            return -1;
        } else {
            return 0;
        }
    }

}
