package Easy;

public class WholeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static boolean isAvgWhole(int[] arr) {
		double sum = 0;
		boolean flag = false;
		for(int i = 0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		if(sum%1 ==0) {
			flag = true;
		}
		return flag;
	}

}
