package Unit_3;

import java.util.Scanner;

public class U3_L3_Activity_One {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int i = s.nextInt();
    if (i >= 0) {
      System.out.println("Positive");
    } else {
      System.out.println("Negative");
    }
  }
}
