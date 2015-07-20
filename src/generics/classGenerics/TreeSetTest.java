package generics.classGenerics;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		String pangram = "the quick brown fox jumps over the lazy fox";
		Set<Character> aToZ = new TreeSet<Character>();
		for (char gram : pangram.toCharArray()) {
			aToZ.add(gram);
		}
		System.out.println("the program is :" + pangram);
		System.out.println("The sorted character: " + aToZ);
	}
}
