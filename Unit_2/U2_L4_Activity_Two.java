package Unit_2;

import java.util.Scanner;

public class U2_L4_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = new String(str1);
    str1 = str1.toUpperCase();
    System.out.println(str1);
    System.out.println(str2);
  }
}
