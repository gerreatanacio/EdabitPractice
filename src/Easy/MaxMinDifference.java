package Easy;

import java.util.Arrays;

public class MaxMinDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
	}

	public static int differenceMaxMin(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1] - arr[0];
	}

}
