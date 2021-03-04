/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a three digit number:");
    int n = scan.nextInt();

    int first = n % 10;
    int tens = n % 100 / 10;
    int hunds = n / 100;
    System.out.println("Here are the digits: \n" + first + "\n" + tens + "\n" + hunds);
  }
}
