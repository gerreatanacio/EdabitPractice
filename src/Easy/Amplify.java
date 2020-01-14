package Easy;

import java.util.Arrays;

public class Amplify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(amplify(12)));
	}

	public static int[] amplify(int num) {
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = i + 1;
			if (arr[i] % 4 == 0) {
				arr[i] *= 10;
			}
			System.out.println(arr[i]);
		}
		return arr;
	}

}
