package Unit_2;

import java.util.Scanner;

public class U2_L1_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String pwd = "letmein";
    System.out.println("Default password is " + pwd);
    System.out.println("Type a new password");
    String nPwd = scan.nextLine();
    System.out.println("The new password is " + nPwd);
  }
}
