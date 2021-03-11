package Unit_3;

import java.util.Scanner;

public class U3_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("What is the temperature?");
    double t = s.nextDouble();
    System.out.println(t <= 102 && 99 <= t ? "Temperature is OK" : "WARNING");
  }
}
