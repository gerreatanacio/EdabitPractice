package Easy;

public class StrangePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStrangePair("", ""));
	}

	public static boolean isStrangePair(String s1, String s2) {
		boolean flag = false;
		if (s1.isEmpty() && !s2.isEmpty() || s2.isEmpty() && !s1.isEmpty()) {
			flag = false;
		} else if (s1.isEmpty() && s2.isEmpty()
				|| (s1.charAt(0) == s2.charAt(s2.length() - 1)) && (s2.charAt(0) == s1.charAt(s1.length() - 1))) {
			flag = true;
		}
		return flag;
	}
}
