package Easy;

public class FirstVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstVowel("STRAWBERRY"));
	}

	public static int firstVowel(String str) {
		int position = 0;
		String vowel = "aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
			if (vowel.contains(String.valueOf(str.charAt(i)))) {
				position = i;
				break;
			}
		}
		return position;
	}

}
