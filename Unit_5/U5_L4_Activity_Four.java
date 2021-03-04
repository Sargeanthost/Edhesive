/* Lesson 4 Coding Activity Question 4 */

public class U5_L4_Activity_Four {

  public static boolean hasRepeat(String str) {
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
        return true;
      }
    }
    return false;
  }
}
