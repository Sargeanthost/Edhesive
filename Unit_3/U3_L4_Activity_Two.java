/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L4_Activity_Two {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    System.out.println(
        n >= 0 && k >= 0 ? "Both are positive or zero." : "One or both are negative.");
  }
}
