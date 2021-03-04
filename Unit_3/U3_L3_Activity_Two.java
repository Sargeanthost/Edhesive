/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L3_Activity_Two {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int g = s.nextInt();
    if (g == 4) {
      System.out.println("A");
    } else if (g == 3) {
      System.out.println("B");
    } else if (g == 2) {
      System.out.println("C");
    } else if (g == 1) {
      System.out.println("D");
    } else if (g == 0) {
      System.out.println("F");
    }
  }
}
