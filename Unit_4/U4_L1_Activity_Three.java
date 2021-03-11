package Unit_4;
import java.util.Scanner;

public class U4_L1_Activity_Three {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input a word:");
    String w = s.nextLine();
    String fw = "";

    for (int i = 0; i < w.length(); i += 2) {
      fw += w.charAt(i);
    }
    System.out.println(fw);
  }
}
