package Unit_4;
import java.util.Scanner;

public class U4_L1_Activity_One {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int count = 0;
    int n = 0;
    System.out.println("Enter positive numbers (-1 to stop)");
    n = s.nextInt();
    while (n != -1) {
      count += n;
      n = s.nextInt();
    }
    System.out.print("Sum is " + count);
  }
}
