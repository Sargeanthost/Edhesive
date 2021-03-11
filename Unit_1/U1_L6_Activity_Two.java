package Unit_1;

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number:");
    double n = scan.nextDouble();
    System.out.println("Answer: " + Math.round(n));
  }
}
