package Unit_3;

import java.util.Scanner;

public class U3_L5_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = scan.nextInt();
    int b = scan.nextInt();

    if (a == 0 || b % a != 0) {
      System.out.println(b + " is not a multiple of " + a);
    } else {
      System.out.println(b + " is a multiple of " + a);
    }
  }
}
