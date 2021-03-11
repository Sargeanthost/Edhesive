package Unit_4;
import java.util.Scanner;

public class Assignment4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Type the message to be shortened");
    String str = s.nextLine().toLowerCase();
    String wrd = "";
    int v = 0;
    int r = 0;
    // alg 1
    for (int i = 0; i < str.length(); i++) {
      // we dont care about the first letter per instructions
      if (i > 0) {
        // if a vowel, and not a starting vowel, discard
        if ((str.charAt(i) == 'a'
                || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
            && (!(str.charAt(i - 1) == ' '))) {
          v++;
          // remove repeating letters
        } else if (str.charAt(i) == str.charAt(i - 1)) {
          r++;
        } else {
          wrd += str.charAt(i);
        }
      } else {
        // add the first letter of the word to new string, could probably
        // be done another way
        wrd += str.charAt(i);
      }
    }
    System.out.println("\nAlgorithm 1");
    System.out.println("Vowels removed: " + v);
    System.out.println("Repeats removed: " + r);
    System.out.println("Algorithm 1 message: " + wrd);
    System.out.println("Algorithm 1 characters saved: " + (v + r));

    // alg 2
    int saved = 0;
    int count = 0;
    char curChar = ' ';
    String message = str.replaceAll(" ", "");
    String newString = "";
    // not very efficient but it works
    for (int i = 0; i < message.length(); i++) {
      // start new counter for each letter
      count = 0;
      curChar = message.charAt(i);
      // if current char isn't in the new message
      if (newString.indexOf(curChar) == -1) {
        // loop through message and see if there are anymore of the same chars
        for (int x = 0; x < message.length(); x++) {
          if (message.charAt(x) == curChar) {
            // add them to the total
            count++;
          }
        }
        // add them to the string
        newString += count + "" + curChar;
        // we have this on this line because we only want individual chars
        // saved, not the many "concatenated" by the alg
        saved++;
      }
    }
    System.out.println("\nAlgorithm 2");
    System.out.println("Unique characters found:" + saved);
    System.out.println("Algorithm 2 message: " + newString);
    System.out.println("Algorithm 2 characters saved: " + (str.length() - newString.length()));
  }
}
