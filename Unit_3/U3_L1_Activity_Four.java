package Unit_3;

import java.util.Scanner;

public class U3_L1_Activity_Four {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter an integer:");
    int n = s.nextInt();
    String msg = (n % 2 == 0) ? "Even" : "Odd";
    System.out.println(msg);
  }
}
