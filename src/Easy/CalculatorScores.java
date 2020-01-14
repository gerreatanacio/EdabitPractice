package Easy;

import java.util.Arrays;

public class CalculatorScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateScores("ABACCAACC");
	}

	public static int[] calculateScores(String str) {
		int a = 0;
		int b = 0;
		int c = 0;
		int[] arr = new int[3];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A'||str.charAt(i) == 'a') {
				a++;
			} else if (str.charAt(i) == 'B'||str.charAt(i) == 'b') {
				b++;
			} else if (str.charAt(i) == 'C'||str.charAt(i) == 'c') {
				c++;
			}
		}
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
