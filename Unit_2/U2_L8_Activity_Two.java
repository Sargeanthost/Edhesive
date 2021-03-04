/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter distance east:");
    double e = scan.nextDouble();
    System.out.println("Enter distance north:");
    double n = scan.nextDouble();

    double h = Math.sqrt(Math.pow(e, 2) + Math.pow(n, 2));
    System.out.println("Distance between points: " + h);
  }
}
