package Unit_7;

import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter words, enter STOP to stop the loop.");

        while (true) {
            String nextLine = s.nextLine();
            if (nextLine.equalsIgnoreCase("stop")) {
                break;
            } else {
                stringList.add(nextLine);
            }
        }

        System.out.println(stringList);
        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }

    }

}
