package Easy;

public class FormatPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(formatPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,10}));
	}
	public static String formatPhoneNumber(int[] nums) {
//		String numberString = "";
//	for (int i = 0; i<nums.length; i++) {
//		numberString = numberString + nums[i];
//		System.out.println(numberString);
//	}
//		String finalString = numberString.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
//		return finalString;
//	}
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0],nums[1],nums[2],nums[3],nums[4],nums[5],nums[6],nums[7],nums[8],nums[9]);
}
}