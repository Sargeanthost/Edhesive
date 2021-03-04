import java.util.Scanner;

public class U4_L1_5_Activity_One {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int fac = 1;
    while (fac <= 9) {
      System.out.println(num * fac);
      fac++;
    }
  }
}
