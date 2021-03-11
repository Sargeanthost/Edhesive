package Unit_2;

import java.util.Scanner;

public class U2_L7_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Integer a = null;
    Integer b = null;
    System.out.println(a + " " + b);
    System.out.println("Enter values:");
    a = scan.nextInt();
    b = scan.nextInt();

    Double avg = new Double(((double) a + b) / 2);
    System.out.println("Average of " + a + " and " + b + " is " + avg);
  }
}
