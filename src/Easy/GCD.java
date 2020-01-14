package Easy;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(7,14));
	}

	public static int gcd(int n1, int n2) {
		int lower = 0;
		int higher = 0;
		if(n1<n2){
			lower = n1;
			higher = n2;
		} else{
			lower = n2;
			higher = n1;
		}

		int gcd = 1;
		for (int i = 1; i <=lower && i <higher; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}