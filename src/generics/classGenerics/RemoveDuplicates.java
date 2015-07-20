package generics.classGenerics;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel";
		Set<String> words = new HashSet<>();
		for (String word : tongueTwister.split("\\W+")) {
			words.add(word);
		}

		System.out.println("The tongue twister is: " + tongueTwister);
		System.out.println("Thw words used were: ");
		System.out.println(words);
	}
}
