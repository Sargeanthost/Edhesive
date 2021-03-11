package Unit_4;
import java.util.Scanner;

public class U4_L4_Activity_Two {
  public static void main(String[] args) {
    String wrd = "";
    Scanner s = new Scanner(System.in);
    System.out.println("Enter String:");
    String str = s.nextLine().toLowerCase();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != 'a'
          && str.charAt(i) != 'e'
          && str.charAt(i) != 'i'
          && str.charAt(i) != 'o'
          && str.charAt(i) != 'u') {
        wrd += str.charAt(i);
      }
    }
    System.out.println(wrd);
  }
}
