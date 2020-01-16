package Easy;

import java.util.Arrays;

public class EvenNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(findEvenNums(2)));
	}

	public static int[] findEvenNums(int num) {
		int[] arr = new int[num / 2];
		int index = 0;
		int[] emptyArr = {};
		if (num >= 2) {
			for (int i = 2; i <= num; i++) {
				if (i % 2 == 0) {
					arr[index] = i;
					index++;
				}
			}
			return arr;

		} else {
			return emptyArr;
		}

	}
}
