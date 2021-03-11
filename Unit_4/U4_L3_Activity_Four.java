package Unit_4;
import java.util.Scanner;

public class U4_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = s.nextInt();
    if (n < 0) {
      System.out.println("error");
    } else if (n == 0) {
      System.out.print("");

    } else {
      for (int i = n; i >= 0; i--) {
        if (i % 5 == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
}
