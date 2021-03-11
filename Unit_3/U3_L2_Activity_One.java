package Unit_3;

import java.util.Scanner;

public class U3_L2_Activity_One {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double n = s.nextDouble();
    double n2 = s.nextDouble();
    double n3 = s.nextDouble();
    double n4 = s.nextDouble();

    if (((n + n2 + n3 + n4) / 4) >= 89.5) System.out.println("ABOVE AVERAGE");
  }
}
