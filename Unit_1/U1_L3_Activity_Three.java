package Unit_1;

import java.util.Scanner;

public class U1_L3_Activity_Three {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Java is a programming language, true or false?");
    boolean userOne = scan.nextBoolean();
    System.out.println("Only numbers can be stored by variables in Java, true or false?");
    boolean userTwo = scan.nextBoolean();
    System.out.println(
        "There are only 2 possible values which can be held by a boolean variable, true or false?");
    boolean userThree = scan.nextBoolean();

    System.out.println("Question 1 - Your answer: " + userOne + ". Correct answer: true");
    System.out.println("Question 2 - Your answer: " + userTwo + ". Correct answer: false");
    System.out.println("Question 3 - Your answer: " + userThree + ". Correct answer: true");
  }
}
