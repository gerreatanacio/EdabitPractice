package Easy;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(minMax(new double [] {1, 2, 3, 4, 5})));
	}

	public static double[] minMax(double[] arr) {
		Arrays.sort(arr);
		double min = arr[0];
		double max = arr[arr.length - 1];
		double[] newArr = new double[] { min, max };
		return newArr;
	}
}
