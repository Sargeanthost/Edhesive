package Unit_3;

import java.util.Scanner;

public class U3_L2_Activity_Three {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter a test score:");
    double t = s.nextDouble();
    System.out.println(0 <= t && t <= 100 ? "" : "Not Valid");
  }
}
