package Easy;

import java.util.Arrays;

public class IntArrayAssorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(sortNumsAscending(new int[] {1,2,-98,78,35})));
	}
	public static int[] sortNumsAscending(int[] nums) {
		Arrays.sort(nums);
		return nums;
	}
}

