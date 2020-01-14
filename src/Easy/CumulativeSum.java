package Easy;

import java.util.Arrays;

public class CumulativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(cumulativeSum(new int[] {3, 3, -2, 408, 3, 3})));
	}
	public static int[] cumulativeSum(int[] nums) {
		int sum = 0;
		int[] arr = new int[nums.length];
		for(int i = 0; i<nums.length; i++){
			sum+=nums[i];
			arr[i] = sum;
		}
		return arr;
	}

}
