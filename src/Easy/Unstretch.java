package Easy;

public class Unstretch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unstretch("cccccaaarrrbbonnnnn");
	}

	public static String unstretch(String word) {
		String newWord = word.replaceAll("(?s)(.)\\1+", "$1");
		System.out.println(newWord);
		return newWord;
	}
}
