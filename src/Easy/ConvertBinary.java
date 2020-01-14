package Easy;

public class ConvertBinary {

	public static void main(String[] args) {
		System.out.println(convertBinary("aaabbqqqq"));
	}

	public static String convertBinary(String str) {
		String wordBinary = "";
		String am = "abcdefghijklm";
		String nz = "nopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			
			if(am.contains(String.valueOf(str.toLowerCase().charAt(i)))){
				wordBinary+=0;
			}else if(nz.contains(String.valueOf(str.toLowerCase().charAt(i)))){
				wordBinary+=1;
			}
			
			
//			if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'b'
//					|| str.toLowerCase().charAt(i) == 'b' || str.toLowerCase().charAt(i) == 'b'
//					|| str.toLowerCase().charAt(i) == 'c' || str.toLowerCase().charAt(i) == 'd'
//					|| str.toLowerCase().charAt(i) == 'e' || str.toLowerCase().charAt(i) == 'f'
//					|| str.toLowerCase().charAt(i) == 'g' || str.toLowerCase().charAt(i) == 'h'
//					|| str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'j'
//					|| str.toLowerCase().charAt(i) == 'k' || str.toLowerCase().charAt(i) == 'l'
//					|| str.toLowerCase().charAt(i) == 'm') {
//				wordBinary += 0;
//			} else if (str.toLowerCase().charAt(i) == 'n' || str.toLowerCase().charAt(i) == 'o'
//					|| str.toLowerCase().charAt(i) == 'p' || str.toLowerCase().charAt(i) == 'q'
//					|| str.toLowerCase().charAt(i) == 'r' || str.toLowerCase().charAt(i) == 's'
//					|| str.toLowerCase().charAt(i) == 't' || str.toLowerCase().charAt(i) == 'u'
//					|| str.toLowerCase().charAt(i) == 'v' || str.toLowerCase().charAt(i) == 'w'
//					|| str.toLowerCase().charAt(i) == 'x' || str.toLowerCase().charAt(i) == 'y'
//					|| str.toLowerCase().charAt(i) == 'z') {
//				wordBinary += 1;
//			}
			
			
		}

		return wordBinary;
	}

}
