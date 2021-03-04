/* Lesson 6 Coding Activity Question 2 */

import edhesive.shapes.*;
import java.util.Scanner;

public class U2_L6_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter radius:");
    double rad = scan.nextDouble();
    Circle cir = new Circle(rad);

    System.out.println("Area: " + cir.getArea());

    System.out.println("Radius is being doubled...");
    double rad2 = cir.getRadius() * 2;
    cir.setRadius(rad2);
    System.out.println("Area: " + cir.getArea());
  }
}
