package Unit_4;
import java.util.Scanner;

public class U4_L1_5_Activity_Two {
  public static void main(String[] args) {

    int prod = 1;
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    while (num > 0) {
      prod = prod * num;
      num--;
    }

    System.out.println(prod);
  }
}
