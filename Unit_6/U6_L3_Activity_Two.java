package Unit_6;

public class U6_L3_Activity_Two {

    public static void reverse(String[] words) {
        String[] output = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            // toString so we add the string, not the object StringBuilder
            output[i] = new StringBuilder(words[i]).reverse().toString();
        }
        for (String word : output) {
            System.out.println(word);
        }
    }

}
