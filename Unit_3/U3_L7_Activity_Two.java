package Unit_3;

import java.util.Scanner;

public class U3_L7_Activity_Two {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter 2 strings:");
    String str1 = s.nextLine();
    String str2 = s.nextLine();
    if (str1.equals(str2)) {
      System.out.println("Great!");
    } else if (str1.substring(0, str1.length() - 1).equals(str2.substring(0, str1.length() - 1))
        && str1.length() == str2.length()) {
      System.out.println("Close enough");
    } else {
      System.out.println("Try again");
    }
  }
}
