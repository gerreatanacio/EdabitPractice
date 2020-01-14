package Easy;

import java.util.Arrays;

public class HashPlusCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(hashPlusCount("###+")));
	}

	public static int[] hashPlusCount(String s) {
		int hash = 0;
		int plus = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				hash++;
			} else if (s.charAt(i) == '+') {
				plus++;
			}
		}
		int[] array = new int[] { hash, plus };
		return array;
	}
}
