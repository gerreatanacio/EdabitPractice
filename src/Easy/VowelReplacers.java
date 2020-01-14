package Easy;

public class VowelReplacers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceVowels("the aardvark", '#'));
	}
	public static String replaceVowels(String str, char ch) {
		StringBuilder finale = new StringBuilder(str.replaceAll("[aeiouAEIOU]", String.valueOf(ch)));
		return finale.toString();
	}

}
