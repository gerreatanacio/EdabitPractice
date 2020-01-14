package Easy;

public class FirstDoubleLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doubleLetters("loop"));
		System.out.println(doubleLetters("yummy"));
		System.out.println(doubleLetters("munchkin"));
		System.out.println(doubleLetters("orange"));
		System.out.println(doubleLetters("apple"));
		
	}

	public static boolean doubleLetters(String word) {
		char previousLetter = 'x';
		char currentLetter;
		boolean flag = false;
		for (int i = 0; i < word.length(); i++) {

			currentLetter = word.charAt(i);
			if (currentLetter != previousLetter) {
				previousLetter = currentLetter;
			} else {
				flag = true;
			}
		}
		return flag;
	}
}