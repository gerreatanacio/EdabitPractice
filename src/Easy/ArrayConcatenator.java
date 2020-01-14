package Easy;

import java.util.Arrays;

public class ArrayConcatenator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
concat(new int[] {1,2,3}, new int[] {4,5,6});
	}
	public static int[] concat(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int i = 0;
		for(i = 0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		int j = i;
		for(int x = 0; x<arr2.length; x++) {
			arr3[j+x] = arr2[x];
		}
		System.out.println(Arrays.toString(arr3));
		return arr3;
	}

}
