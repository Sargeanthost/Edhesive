/* Lesson 7 Coding Activity Question 3 */

import edhesive.shapes.*;
import java.util.Scanner;

public class U3_L7_Activity_Three {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter length");

    double len1 = s.nextDouble();
    Rectangle rect1 = new Rectangle(len1);

    System.out.println("Enter 2 lengths");

    double len2 = s.nextDouble();
    double len3 = s.nextDouble();
    Rectangle rect2 = new Rectangle(len2, len3);

    System.out.println(rect1.equals(rect2) ? "Congruent Rectangles" : "Different Rectangles");
  }
}
