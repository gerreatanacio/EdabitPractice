package Easy;

import java.util.Arrays;

public class AlphabetSoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alphabetSoup("geek"));
		System.out.println(alphabetSoup("edabit"));
	}

	public static String alphabetSoup(String s) {
		String [] arr = s.split("");
		Arrays.sort(arr);
		StringBuilder newWord = new StringBuilder();
		for(int i = 0; i<arr.length; i++) {
			newWord.append(arr[i]);
		}
		return newWord.toString();
	}

}