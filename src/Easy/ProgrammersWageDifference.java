package Easy;

import java.util.Arrays;

public class ProgrammersWageDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(programmers(12,19,1,15,44));
	}
	public static int programmers(int...i) {
		int[] digits = i;
		Arrays.sort(digits);
		
		return digits[digits.length-1] - digits[0];
  }

}
