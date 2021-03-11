package Unit_3;

import java.util.Scanner;

public class U3_L6_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();

    if (!(x < 4) || !(y > 5 || x + y >= 7)) System.out.println("pass");
  }
}
