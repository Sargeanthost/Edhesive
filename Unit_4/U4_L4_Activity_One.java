package Unit_4;
import java.util.Scanner;

public class U4_L4_Activity_One {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input String:");
    String str = s.nextLine().toUpperCase();
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals("SH")) {
        count++;
      }
    }
    System.out.println("Contains \"sh\" " + count + " times.");
  }
}
