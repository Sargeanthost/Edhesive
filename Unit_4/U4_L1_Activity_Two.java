package Edhesive.Unit_4;

/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_Activity_Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Scores:");
        int sum = 0;
        int count = 0;
        int j = 0;
        count = s.nextInt();
        while (count != -1) {
            sum += count;
            j++;
            count = s.nextInt();
        }
        System.out.println("The average is: " + (double) sum / j);

    }
}