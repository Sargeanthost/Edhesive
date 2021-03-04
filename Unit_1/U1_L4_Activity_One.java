/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L4_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter an integer");
    int n = scan.nextInt();

    System.out.println("number is now " + ++n);
    System.out.println("number is now " + ++n);
    System.out.println("number is now " + ++n);
    System.out.println("number is now " + --n);
    System.out.println("number is now " + --n);
    System.out.println("number is now " + --n);
  }
}
