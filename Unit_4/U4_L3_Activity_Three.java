// works fine when running, passes 4 and 5 to my knowledge
package Unit_4;
import java.util.Scanner;

public class U4_L3_Activity_Three {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 100:");
    int n = s.nextInt();
    if (n <= 0 || n >= 100) {
      System.out.println("error");
    } else {

      for (int i = n; i < 101; i++) {
        // end will be one "less than" the first place of original number
        System.out.print(i + ((i - (n - 1)) % 20 == 0 ? "\n" : " "));
      }
    }
  }
}
