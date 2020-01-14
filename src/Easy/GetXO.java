package Easy;

public class GetXO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getXO("Xo"));
	}

	public static boolean getXO(String str) {
		boolean flag = false;
		int x = 0;
		int o = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
				x++;
			} else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
				o++;
			}
		}
		System.out.println(x);
		System.out.println(o);
		flag = x==o;
		return flag;
	}
}
