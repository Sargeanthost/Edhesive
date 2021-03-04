/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

class U1_L4_Activity_Four {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a price:");
    double cash = scan.nextDouble();
    System.out.println("Change from $20: $" + (20 - cash));
  }
}
