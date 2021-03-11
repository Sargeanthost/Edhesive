package Unit_4;
import java.util.Scanner;

public class U4_L2_Activity_One {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int n = s.nextInt();
    int y = s.nextInt();
    // i = n makes first number to print between n and y
    for (int i = n; i <= y; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
