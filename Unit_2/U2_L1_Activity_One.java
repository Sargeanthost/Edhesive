package Edhesive.Unit_2;

/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L1_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String n = scan.nextLine();
        System.out.println("What is your age?");
        int a = scan.nextInt();
        System.out.println(n + " is " + a + " years old.");

    }
}
