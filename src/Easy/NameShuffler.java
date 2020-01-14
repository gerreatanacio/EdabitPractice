package Easy;

public class NameShuffler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nameShuffle("Hello World"));
	}

	public static String nameShuffle(String s) {
		String newWord = "";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			newWord = newWord + " " + arr[arr.length - 1 - i];
		}
		String finalWord = newWord.trim();
		return finalWord;
	}
}
