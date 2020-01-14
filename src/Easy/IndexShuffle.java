package Easy;

public class IndexShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(indexShuffle("abcd"));
	}
	public static String indexShuffle(String str) {
	StringBuilder even = new StringBuilder("");
	StringBuilder odd = new StringBuilder("");
	
	for(int i = 0; i<str.length(); i++) {
		if(i%2==0) {
			even.append(str.charAt(i));
		}else {
			odd.append(str.charAt(i));
		}
	}
	String finalWord = even.toString().concat(odd.toString());
	return finalWord;
	}
}
