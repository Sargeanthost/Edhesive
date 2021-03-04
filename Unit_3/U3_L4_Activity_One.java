/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L4_Activity_One {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = s.nextInt();
    System.out.println(n <= 76 && n >= 5 ? "False" : "True");
  }
}
