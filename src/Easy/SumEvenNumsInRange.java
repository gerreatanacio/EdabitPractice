package Easy;

public class SumEvenNumsInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumEvenNumsInRange(51,150));
	}

	public static int sumEvenNumsInRange(int start, int stop) {
		int sum = 0;
		for (int i = start; i <= stop; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
