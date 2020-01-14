package Easy;

import java.util.Arrays;

public class ExtensionGenerator {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getExtension(new String[] { "code.html", "code.css" })));

	}

	public static String[] getExtension(String[] arr) {
		String[] resultArr = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			resultArr[i] = arr[i].replaceAll("^\\w*\\.", "");
			System.out.println(resultArr[i]);
		}
		return resultArr;
	}
}
