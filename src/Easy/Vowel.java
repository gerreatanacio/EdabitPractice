package Easy;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getCount(String str) {
		int vowelsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount++;
			}
		}
		return vowelsCount;
	}
}
