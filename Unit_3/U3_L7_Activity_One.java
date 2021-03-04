/* Lesson 7 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L7_Activity_One {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String pwd = "swordfish";
    System.out.println("Enter password:");
    String str = s.nextLine();
    System.out.println(str.equals(pwd) ? "Access granted!" : "Access denied!");
  }
}
