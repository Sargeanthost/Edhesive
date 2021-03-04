/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the movie name");
    String title = scan.nextLine();
    System.out.println("Please enter the running time in minutes.");
    int time = scan.nextInt();
    System.out.println("Please enter ratings from the movie review website.");
    double web1 = scan.nextDouble();
    double web2 = scan.nextDouble();
    double web3 = scan.nextDouble();
    System.out.println("Please enter ratings from the focus group.");
    double focus1 = scan.nextDouble();
    double focus2 = scan.nextDouble();
    System.out.println("Please enter the average movie critic rating.");
    double crit = scan.nextDouble();

    double webRate = (web1 + web2 + web3) / 3;
    double focusRate = (focus1 + focus2) / 2;

    System.out.println("Title: " + title);

    System.out.println("Running time: " + time / 60 + "h" + time % 60);

    System.out.println("Average website rating: " + webRate);

    System.out.println("Average focus group rating: " + focusRate);

    System.out.println("Average movie critic rating: " + crit);

    System.out.println(
        "Overall movie rating: " + Math.round(.2 * webRate + .3 * focusRate + .5 * crit));
  }
}
