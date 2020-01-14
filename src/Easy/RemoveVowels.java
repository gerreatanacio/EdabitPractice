package Easy;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeVowels("I have never seen a thin person drinking Diet Coke."));
	}

	public static String removeVowels(String s) {
		StringBuilder finalWord = new StringBuilder();
		String vowel = "aeiouAEIOU";

		for (int i = 0; i < s.length(); i++) {
			if ((vowel.contains(String.valueOf(s.charAt(i))))) {
				finalWord.append("");
			} else {
				finalWord.append(s.charAt(i));
			}
		}
		return String.valueOf(finalWord);
	}
}
