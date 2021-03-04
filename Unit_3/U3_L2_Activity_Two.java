/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two {
  public static void main(String[] args) {

    double n;
    double n1;

    try (Scanner s = new Scanner(System.in)) {

      System.out.println("Please enter two numbers:");
      n = s.nextDouble();
      n1 = s.nextDouble();
    }
    System.out.println(n > n1 && n != n1 ? n : n1);
  }
}
