package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CityFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(grabCity("[Hello] bitch I'm [Home Island]"));
	}

	public static String grabCity(String str) {
		Pattern pattern  = Pattern.compile("\\[[a-zA-Z\\s]+\\]");
		Matcher matcher = pattern.matcher(str);
		List<String> arrList = new ArrayList<String>();
		
		while(matcher.find()) {
			arrList.add(str.substring(matcher.start()+1, matcher.end()-1));
		}
		return arrList.get(arrList.size()-1);
	}

}
