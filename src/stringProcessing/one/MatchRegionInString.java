package stringProcessing.one;

public class MatchRegionInString {
	public static void main(String[] args) {
		String chat = "Tarzan: Hi Jane, wanna ride an Elephant? \n"
				+ "Jane: No thanks! I am preparing for OCPJP now! ";

		String matchString = "Jane: No thanks!";
		int startIndex = chat.indexOf("\n");

		System.out.println("Jane's responses start at index: " + startIndex);
		
		if(startIndex > -1){
			boolean doesMatch = chat.regionMatches(startIndex+1, matchString, 0, matchString.length());
			
			if(doesMatch)
				System.out.println("Jane's response matches with the string "+ matchString);
		}
	}
}
