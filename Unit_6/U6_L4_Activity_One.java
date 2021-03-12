package Unit_6;

public class U6_L4_Activity_One {

  public static boolean insert(String[] words, String newWord, int place) {

    if (place >= 0 && place < words.length) {
      String[] temp = new String[words.length];

      // copy into temp array up to place, rest will be null
      System.arraycopy(words, 0, temp, 0, place);
      // keep place null, and copy over the rest of the elements after place
      System.arraycopy(words, place, temp, place + 1, words.length - place - 1);
      // replace the null place element with the value of new word
      temp[place] = newWord;

      for (int i = 0; i < temp.length; i++) {
        // instead of creating a new reference we replace the old array
        words[i] = temp[i];
      }
      return true;
    }

    return false;
  }
}
