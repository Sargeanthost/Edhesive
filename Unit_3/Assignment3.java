import java.util.Scanner;

public class Assignment3 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome. What is your name?");
    String n = s.nextLine();
    System.out.println("Hello " + n + ". Are you ready to crack the code?");
    String ans = s.nextLine();
    if (!ans.toUpperCase().equals("YES")) {
      System.exit(0);
    }

    System.out.println("PHASE 1");
    System.out.println("Enter a number:");
    int a1 = s.nextInt();
    if (a1 == 3) {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
      System.exit(0);
    }

    System.out.println("PHASE 2");
    System.out.println("Enter a number:");
    int a2 = s.nextInt();
    if (a2 == 1 || a2 >= 33 && a2 <= 100) {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
      System.exit(0);
    }

    System.out.println("PHASE 3");
    System.out.println("Enter a number:");
    int a3 = s.nextInt();
    if (a3 > 0 && (a3 % 3 == 0 || a3 % 7 == 0)) {
      System.out.println("Correct!");
      System.out.println("You have cracked the code! ");
    } else {
      System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
      System.exit(0);
    }
  }
}
