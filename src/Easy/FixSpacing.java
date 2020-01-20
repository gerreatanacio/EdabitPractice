package Easy;

public class FixSpacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(correctSpacing("The film   starts       at      midnight. "));
	}

	public static String correctSpacing(String sentence) {
		return sentence.replaceAll("[\\s]+", " ").trim();
	}

}
