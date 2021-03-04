/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L2_Activity_Two {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = s.nextInt();
    while (n > 0) {
      System.out.println(n % 10);
      n /= 10;
    }
  }
}
