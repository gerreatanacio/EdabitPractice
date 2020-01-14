package Easy;

public class CheckEnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkEnding("abc",""));
	}
	public static boolean checkEnding(String str1, String str2) {
	    return str1.endsWith(str2);
	  }
}
