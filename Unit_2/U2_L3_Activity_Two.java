package Unit_2;

import java.util.Scanner;

public class U2_L3_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter astring:");
    String s = scan.nextLine();
    System.out.print(s.substring(1, s.length() - 1));
  }
}
