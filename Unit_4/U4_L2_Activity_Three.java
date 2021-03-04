import java.util.Scanner;

public class U4_L2_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double lo = 0.0;
    double la = 0.0;
    int choice = -1;
    double fn = -90.0;
    double fs = 90.0;
    double fe = -180.0;
    double fw = 180.0;

    do {
      System.out.println("Please enter the longitude:");
      lo = scan.nextDouble();
      System.out.println("Please enter the latitude:");
      la = scan.nextDouble();
      if (lo < -180 || lo > 180 || la < -90 || la > 90) {
        System.out.println("Incorrect Latitude or Longitude");
      } else {
        if (la > fn) {
          fn = la;
        }
        if (la < fs) {
          fs = la;
        }
        if (lo > fe) {
          fe = lo;
        }
        if (lo < fw) {
          fw = lo;
        }
      }
      System.out.println("Would you like to enter another location (1 for yes, 0 for no)?");
      choice = scan.nextInt();
    } while (choice == 1);

    // %.3f denotes maximum 3 digits after the decimal. the f represents float value
    System.out.printf(
        "Farthest North: %.3f\nFarthest South: %.3f\nFarthest East: %.3f\nFarthest West: %.3f",
        fn, fs, fe, fw);
  }
}
