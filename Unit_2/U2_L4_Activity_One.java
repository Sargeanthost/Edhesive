package Unit_2;

import java.util.Scanner;

public class U2_L4_Activity_One {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // Get first string
    System.out.println("Enter first string");
    String s1 = scan.nextLine();

    // Get second string
    System.out.println("Enter second string");
    String s2 = scan.nextLine();

    // Get number of letters to use from each string
    System.out.println("Enter number of letters from each word");
    int n = scan.nextInt();

    // Print start of first string and end of second string
    System.out.println(s1.substring(0, n) + s2.substring(s2.length() - n));
  }
}
