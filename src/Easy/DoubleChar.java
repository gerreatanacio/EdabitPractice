package Easy;

public class DoubleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleChar("String");
	}

	public static String doubleChar(String s) {
		String finalWord = "";
		for (int i = 0; i < s.length(); i++) {
			finalWord = finalWord + s.charAt(i) + s.charAt(i);
			System.out.println(finalWord);
		}
		return finalWord;
	}

}
