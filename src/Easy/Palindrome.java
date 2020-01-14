package Easy;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("hello"));
	}

	public static boolean checkPalindrome(String str) {
		String reversedWord = "";
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();
		System.out.println(rev);
		for(int i = 0; i<str.length(); i++) {
			reversedWord += str.charAt(str.length() -1 -i);
		}
		System.out.println(reversedWord);
		return str.equals(reversedWord);
		
	}

}
