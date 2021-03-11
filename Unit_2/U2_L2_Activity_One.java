package Unit_2;

import java.util.Scanner;

public class U2_L2_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item = scan.nextLine();
    System.out.println("How many are you buying?");
    int amount = scan.nextInt();
    System.out.println("How much does each one cost?");
    double cost = scan.nextDouble();
    System.out.println(
        amount + " " + item + " at $" + cost + " each will cost you $" + (amount * cost));
  }
}
