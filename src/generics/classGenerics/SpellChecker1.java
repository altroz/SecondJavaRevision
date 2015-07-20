package generics.classGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpellChecker1 {
	public static void main(String[]args){
		Map<String,String>misspeltWords = new HashMap<String, String>();
		misspeltWords.put("calender", "calendar");
		
		String sentence = "buy a calender for the year of 2013";
		System.out.println("The given senstence is:  "+ sentence);
		Set<String> keys = misspeltWords.keySet();
		
		for(String word: sentence.split("\\W+")){
			System.out.println("The correct spelling for "+ word + " is "+ misspeltWords.get(word));
			
		}
		System.out.println("Mispelt words in spellchecker are: ");
		System.out.println(keys);
	}
}
