package Unit_7;

import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter words, enter STOP to stop the loop.");

        while (true) {
            String s = scan.nextLine();
            if (s.equalsIgnoreCase("stop")) {
                break;
            }
            stringList.add(s);
        }

        ArrayList<String> trimmedList = new ArrayList<>(stringList);
        if (trimmedList.size() > 2) {
            trimmedList.remove(0);
            trimmedList.remove(trimmedList.size() - 1);
        }
        System.out.println(stringList.size() + "\n" + stringList + "\n" + trimmedList);
    }

}
