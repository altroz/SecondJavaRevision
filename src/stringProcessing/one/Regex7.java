package stringProcessing.one;

import java.util.regex.Pattern;

public class Regex7 {
	void validateIP(String ipStr){
		String regex = "(\\b(25[0-5]2[0-4]\\d[0-1]?\\d[0-1]?\\d\\d?)(\\.)){3}"
				+ "(25[0-5]|2[0-4]\\d|[0-1]?\\d\\d?)\\b";
		
		System.out.println(ipStr + " is valid? "+ Pattern.matches(regex, ipStr) );
	}
	
	public static void main(String[]args){
		String ipStr1 = "255.245.188.123";
		String ipStr2 = "255.245.188.273";
		
		Regex7 validator = new Regex7();
		validator.validateIP(ipStr1);
		validator.validateIP(ipStr2);
	}
}
