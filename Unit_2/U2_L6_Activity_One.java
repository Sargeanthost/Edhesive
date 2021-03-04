/* Lesson 6 Coding Activity Question 1 */

import edhesive.shapes.*;
import java.util.Scanner;

public class U2_L6_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of sides:");
    int sides = scan.nextInt();
    System.out.println("Enter side length:");
    double len = scan.nextDouble();
    RegularPolygon poly = new RegularPolygon(sides, len);
    System.out.println(
        "A " + poly + " has perimeter " + poly.getPerimeter() + " and area " + poly.getArea());
  }
}
