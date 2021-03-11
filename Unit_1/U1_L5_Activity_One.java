package Unit_1;

import java.util.Scanner;

class U1_L5_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a two digit number:");
    int n = scan.nextInt();

    int first = n % 10;
    int tens = n / 10;
    System.out.println("Here are the digits: \n" + tens + "\n" + first);
  }
}
