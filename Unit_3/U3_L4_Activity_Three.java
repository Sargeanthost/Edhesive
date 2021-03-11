package Unit_3;

import java.util.Scanner;

public class U3_L4_Activity_Three {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean flag = true;
    System.out.println("Please enter the first octet:");
    int n = s.nextInt();
    System.out.println("Please enter the second octet:");
    int k = s.nextInt();
    System.out.println("Please enter the third octet:");
    int l = s.nextInt();
    System.out.println("Please enter the fourth octet:");
    int p = s.nextInt();

    if (!(n >= 0 && n <= 255)) {
      System.out.println("Octet 1 is incorrect");
      flag = false;
    }
    if (!(k >= 0 && k <= 255)) {
      System.out.println("Octet 2 is incorrect");
      flag = false;
    }
    if (!(l >= 0 && l <= 255)) {
      System.out.println("Octet 3 is incorrect");
      flag = false;
    }
    if (!(p >= 0 && p <= 255)) {
      System.out.println("Octet 4 is incorrect");
      flag = false;
    }
    System.out.println(flag ? "IP Address: " + n + "." + k + "." + l + "." + p : "");
  }
}
