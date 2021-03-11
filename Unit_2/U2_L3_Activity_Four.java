package Unit_2;

import java.util.Scanner;

public class U2_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String word = scan.nextLine();
    String[] words = word.split(" ", 2);
    System.out.println(words[0].length());
  }
}
