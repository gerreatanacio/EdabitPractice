package Easy;

public class Rooks {
	public static void main(String[] args) {
		System.out.println(canCapture(new String[] { "E6", "A8" }));
	}

	public static boolean canCapture(String[] rooks) {
		return (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1));
	}

}
