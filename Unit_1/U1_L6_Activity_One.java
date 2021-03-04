/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter two integers:");
    int one = scan.nextInt();
    int two = scan.nextInt();

    System.out.println("The average is : " + (double) (one + two) / 2);
  }
}
