/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L2_Activity_Three {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Hi there. What is your name?");
    String n = scan.nextLine();
    System.out.println("What adjective describes you?");
    String a = scan.nextLine();
    System.out.println("My name is " + n + ". I am " + a + ".");
  }
}
