package Easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalLetterFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(capToFront("maBerasuA"));
	
		
		}
	
		public static String capToFront(String text) {
			String AllCapsregex = "[A-Z]";
			String firstPart ="";
			String secondPart = text.replaceAll("[A-Z]", "");
		
			Pattern pattern = Pattern.compile(AllCapsregex);
			Matcher matcher = pattern.matcher(text);
			
			while(matcher.find()) {
				firstPart += text.charAt(matcher.start());
			}
			
			
			return (firstPart + secondPart);
			
			
			}
		}
		
	


