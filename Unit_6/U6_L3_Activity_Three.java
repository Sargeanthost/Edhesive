package Unit_6;

public class U6_L3_Activity_Three {

    public static void printIngs(String[] words) {
        for (String word : words) {
            if (word.length() > 3) {
                if (word.endsWith("ing")) {
                    System.out.println(word);
                }
            }
        }
    }
}
