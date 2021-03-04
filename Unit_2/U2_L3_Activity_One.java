/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String string = scan.nextLine();
    String one = string.substring(0, 1);
    String two = string.substring(string.length() - 1);
    System.out.println(one + two);
  }
}
