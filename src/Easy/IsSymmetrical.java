package Easy;

public class IsSymmetrical {
	public static void main(String[] args) {
		System.out.println(isSymmetrical(12321));
	}
	
	public static boolean isSymmetrical(int num) {
	int number = num;
	int reversedNum = 0;
			
		while(number != 0){
			int digit = number % 10;
			reversedNum = reversedNum * 10 + digit;
			number = number/10;
		}	
		System.out.println(num + " and " + reversedNum);
			
		if(num == reversedNum) {
			return true;
		} else {
		return false;
		}
		
	}
	}
