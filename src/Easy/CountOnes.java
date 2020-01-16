package Easy;

public class CountOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOnes(999));
	}

	public static int countOnes(int n) {
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		int count = 0;

		for (int i = 0; i < binary.length(); i++) {
			if (Integer.valueOf(String.valueOf(binary.charAt(i))) == 1) {
				count++;
			}
		}
		return count;
	}

}
