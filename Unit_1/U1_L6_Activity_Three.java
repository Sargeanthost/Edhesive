package Unit_1;

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number: ");
    double n = scan.nextDouble() * 100;
    int l = (int) n % 10;
    int f = ((int) n / 10) % 10;

    System.out.println("Answer: " + f + " " + l);
  }
}
