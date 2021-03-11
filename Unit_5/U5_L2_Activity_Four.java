package Unit_5;
public class U5_L2_Activity_Four {

  public static void realTime(int i) {

    int seconds = i % 60;
    i /= 60;
    int minutes = i % 60;
    i /= 60;
    int hours = i % 60;

    System.out.print("Hours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + seconds);
  }
}
