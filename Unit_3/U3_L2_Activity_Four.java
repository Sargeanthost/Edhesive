/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L2_Activity_Four {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("What is the temperature?");
    double t = s.nextDouble();
    System.out.println((99 <= t && t <= 102) ? "" : "WARNING");
  }
}
