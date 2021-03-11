package Unit_6;

public class U6_L3_Activity_One {

	public static String findLongest(String[] words) {
		int longest = words[0].length();
		int indexOfLongest = 0;
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > longest) {
				longest = words[i].length();
				indexOfLongest = i;
			}
		}
		return words[indexOfLongest];
	}
}
	