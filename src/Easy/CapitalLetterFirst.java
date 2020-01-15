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
			String LowerCapsregex = "[a-z]";
			String firstPart ="";
			String secondPart = "";
		
			Pattern pattern = Pattern.compile(AllCapsregex);
			Pattern patternLower = Pattern.compile(LowerCapsregex);
			Matcher matcher = pattern.matcher(text);
			Matcher matcherX = patternLower.matcher(text);
			
			while(matcher.find()) {
				firstPart += text.charAt(matcher.start());
			}
			
			while(matcherX.find()) {
				secondPart += text.charAt(matcherX.start());
			}
			
			return (firstPart + secondPart);
			
			
			}
		}
		
	


