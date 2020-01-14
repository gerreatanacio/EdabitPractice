package Easy;

public class ReversedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Hello World"));
	}

	public static String reverse(final String str) {
		String reversed = "";
		for (int i = 0; i < str.length(); i++) {
			reversed = reversed + str.charAt(str.length() - 1 - i);
		}
		return reversed;
	}
}