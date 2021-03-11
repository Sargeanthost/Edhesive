package Unit_6;

import java.util.Scanner;

public class U6_L1_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[3];
    arr[0] = scan.nextInt();
    arr[1] = scan.nextInt();
    arr[2] = scan.nextInt();
    System.out.println("Contents: " + arr[0] + " " + arr[1] + " " + arr[2]);
    System.out.println("Sum: " + (arr[0] + arr[1] + arr[2]));
  }
}
