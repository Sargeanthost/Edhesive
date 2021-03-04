/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import edhesive.assignment2.Airplane;
import java.lang.Math.*;
import java.util.Scanner;

public class Assignment2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Airplane a1 = new Airplane();

    System.out.println(
        "Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
    String cs = scan.nextLine().toUpperCase();
    double dist = scan.nextDouble();
    int bar = scan.nextInt();
    int alt = scan.nextInt();

    System.out.println("\nInitial Positions:\n");

    Airplane a2 = new Airplane(cs, dist, bar, alt);
    System.out.println("\"Airplane 1\": " + a1);
    System.out.println("\"Airplane 2\": " + a2);
    System.out.println("The distance between the planes is " + a1.distTo(a2) + " miles.");
    System.out.println(
        "The difference in height between the planes is "
            + Math.abs((a1.getAlt() - a2.getAlt()))
            + " feet.");

    System.out.println("\nNew Positions:\n");

    a1.gainAlt();
    a1.gainAlt();
    a1.gainAlt();
    a1.gainAlt();
    a2.loseAlt();
    a2.loseAlt();
    a1.move(10.5, 50);
    a2.move(8, 125);

    System.out.println("\"Airplane 1\": " + a1);
    System.out.println("\"Airplane 2\": " + a2);
    System.out.println("The distance between the planes is " + a1.distTo(a2) + " miles.");
    System.out.println(
        "The difference in height between the planes is "
            + Math.abs((a1.getAlt() - a2.getAlt()))
            + " feet.");
  }
}
