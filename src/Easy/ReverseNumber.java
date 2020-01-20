package Easy;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev(-900);
	}

	public static String rev(int n) {
		char[] arr = Integer.toString(n).toCharArray();
		StringBuffer word = new StringBuffer("");
		
		for(int i = arr.length -1; i >=0; i--) {
			word.append(arr[i]);
		}
		String newWord = word.toString().replaceAll("-", "");
		return newWord;
	}

}
