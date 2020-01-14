package Easy;

public class IsSpecialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6};
		
		System.out.println(isSpecialArray(arr));
	}

	public static boolean isSpecialArray(int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i += 1) {
			if (i % 2 == 0) {
				if (arr[i] % 2 == 0) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			} else {
				if (arr[i] % 2 != 0) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

		}
		return flag;
	}
}
