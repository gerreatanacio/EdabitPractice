package Easy;

//Write a function that removes any non-letters from a string, returning a well-known film title.

public class LettersOnly {
	public static void main(String[] args) {
		System.out.println(lettersOnly("R!=:~0o0./c&}9k`60=y"));
	}

	public static String lettersOnly(String str) {
		return str.replaceAll("[^a-zA-Z]", "");
	}
	
//	public static String lettersOnly(String str) {
//		String newStr = "";
//		for(int x = 0; x < str.length(); x++) {
//			if( ( (int)str.charAt(x) >= 65 && (int) str.charAt(x) <= 90) || 
//				 ((int) str.charAt(x) >= 97 && (int) str.charAt(x) <= 122)) {
//				newStr += Character.toString(str.charAt(x));
//			}
//		}
//		return newStr;
//	}
}
