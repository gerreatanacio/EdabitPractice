package Easy;

public class Joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(joinPath("hello/", "hi"));
	}

	public static String joinPath(String portion1, String portion2) {
		String pr1 = portion1.replace("/", "");
		String pr2 = portion2.replace("/", "");
		String message = String.join("/", pr1, pr2);
		return message;
	}
}
