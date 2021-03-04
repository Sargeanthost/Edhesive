/* Lesson 5 Coding Activity Question 2 */

import edhesive.shapes.*;
import java.util.Scanner;

public class U2_L5_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Type a radius:");
    double rad = scan.nextDouble();
    Circle cir = new Circle(rad);

    System.out.println("Type a length:");
    double len = scan.nextDouble();

    System.out.println("Type a width:");
    double wid = scan.nextDouble();

    System.out.println(cir);

    Rectangle rect = new Rectangle(len, wid);
    System.out.println(rect);
  }
}
