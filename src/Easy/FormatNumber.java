package Easy;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(formatNum(900000));
	}

	public static String formatNum(int num) {
		String formatted = NumberFormat.getNumberInstance(Locale.US).format(num);
		return formatted;
	}

}
