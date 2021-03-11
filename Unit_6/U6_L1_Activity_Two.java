package Unit_6;

import java.util.Scanner;

public class U6_L1_Activity_Two {
  public static void main(String[] args) {
    int[] h = new int[10];
    h[0] = 0;
    h[1] = 1;
    h[2] = h[0] + h[1];
    h[3] = h[1] + h[2];
    h[4] = h[2] + h[3];
    h[5] = h[3] + h[4];
    h[6] = h[4] + h[5];
    h[7] = h[5] + h[6];
    h[8] = h[6] + h[7];
    h[9] = h[7] + h[8];
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    if (i >= 0 && i < 10) System.out.println(h[i]);
  }
}
