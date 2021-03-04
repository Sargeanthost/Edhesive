/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a radius: ");
    int rad = scan.nextInt();
    System.out.println("Circumference: " + (3.14 * 2 * rad));
    System.out.println("Area: " + (3.14 * rad * rad));
  }
}
