/* Lesson 3 Coding Activity Question 3 */

import edhesive.testing.Math;
import java.util.Scanner;

public class U3_L3_Activity_Three {

  public static void main(String[] args) {

    int a = (int) (Math.random() * 12) + 1;
    int b = (int) (Math.random() * 12) + 1;
    System.out.println(a + " * " + b + " = ?");
    System.out.println("Enter the multiplication of the two numbers.");
    Scanner s = new Scanner(System.in);
    int product = s.nextInt();
    if (product == (a * b)) {
      System.out.println("Correct!");
    } else {
      System.out.println("Wrong");
    }
  }
}
