package Easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindZip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findZip("all zip files are zipped"));
	}

	public static int findZip(String str) {
		Pattern pattern = Pattern.compile("zip");
		Matcher matcher = pattern.matcher(str);
		int[] arr = new int[str.length()];
		int i = 0;
		while (matcher.find()) {
			arr[i] = matcher.start();
			i++;
		}
		
		if(arr[1]>0) {
			return arr[1];
		}else {
			return -1;
		}
	}
}
