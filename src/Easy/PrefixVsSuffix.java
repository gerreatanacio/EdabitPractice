package Easy;

public class PrefixVsSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isPrefix(String word, String prefix) {
		String pref = prefix.replaceAll("-", "");
		return word.startsWith(pref);
	}

	public static boolean isSuffix(String word, String suffix) {
		String suf = suffix.replaceAll("-", "");
		return word.endsWith(suf);
	}

}
