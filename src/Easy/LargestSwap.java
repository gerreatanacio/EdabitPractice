package Easy;

public class LargestSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestSwap(33));
	}

	public static boolean largestSwap(int num) {
		boolean flag = false;
		String number = Integer.toString(num);
		int[] digits = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			digits[i] = Character.getNumericValue(number.charAt(i));
		}
		if (digits[0] < digits[1]) {
			flag = false;
		} else if (digits[0] > digits[1] || digits[0] == digits[1]) {
			flag = true;
		}
		return flag;
	}
}
