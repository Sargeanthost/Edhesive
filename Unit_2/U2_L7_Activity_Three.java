package Unit_2;

import edhesive.shapes.*;
import java.util.Scanner;

public class U2_L7_Activity_Three {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Double radius;
    Double length;
    Integer sides;
    System.out.println("Enter radius:");
    radius = scan.nextDouble();
    System.out.println("Enter length:");
    length = scan.nextDouble();
    System.out.println("Enter sides:");
    sides = scan.nextInt();
    Circle c = new Circle(radius);
    RegularPolygon p = new RegularPolygon(sides, length);
    System.out.println(c);
    System.out.println(p);
  }
}
