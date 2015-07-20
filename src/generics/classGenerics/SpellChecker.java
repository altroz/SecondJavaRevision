package generics.classGenerics;

import java.util.HashMap;
import java.util.Map;

public class SpellChecker {
	public static void main(String[] args) {
		Map<String, String> misspeltWords = new HashMap<String, String>();
		misspeltWords.put("calender", "calendar");
		misspeltWords.put("tomatos", "tomatoes");
		misspeltWords.put("existance", "existence");
		misspeltWords.put("acquiantance", "acquaintance");
		misspeltWords.put("ear", "year");

		String sentence = "Buy a calender for the ear of 2013";
		System.out.println("The given sentance is: " + sentence);

		for (String word : sentence.split("\\W+")) {
			System.out.println("The correct spelling for " + word + " is "
					+ misspeltWords.get(word));
		}
	}
}
