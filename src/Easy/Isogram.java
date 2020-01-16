package Easy;

public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsogram("Gerrel"));
	}
	
	public static boolean isIsogram(String str) {
		String strX = str.toLowerCase();
		String finalStr = "";
		for(int i = 0; i<strX.length(); i++) {
			if(!finalStr.contains(String.valueOf(strX.charAt(i)))) {
				finalStr+=strX.charAt(i);
			}
		}
		boolean matches = strX.equals(finalStr);
		return matches;
	}
  }
