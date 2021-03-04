/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L5_Activity_One {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 2 integers");
    int x = scan.nextInt();
    int y = scan.nextInt();
    if (x != 0 && y / x >= 4 && y / x < 6) System.out.println("Ratio OK");
  }
}
