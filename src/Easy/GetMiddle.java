package Easy;

public class GetMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMiddle("testing"));
	}

	public static String getMiddle(String word) {
		char[] arr = word.toCharArray();
		System.out.println(arr);
		String midWord = "";

		if (arr.length > 2) {
			float mid = arr.length;
			int midLength = Math.round(mid / 2);

			if (arr.length % 2 == 0) {
				midWord += String.valueOf(arr[midLength-1]) + arr[midLength];

			} else {
				midWord += arr[midLength - 1];
			}
			return midWord;

		} else {
			return word;
		}
	}

}
