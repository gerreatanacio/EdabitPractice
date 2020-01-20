package Easy;

import java.util.Arrays;

public class IsBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBetween("apple", "banana", "azure"));
	}

	public static boolean isBetween(String first, String last, String word) {
		String[] arr = {first, last, word};
		Arrays.parallelSort(arr);
		return arr[1].equals(word);
	}

}
