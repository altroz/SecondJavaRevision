package generics.classGenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public void languageSelection() {
		ArrayList<String> languageList = new ArrayList<String>();
		languageList.add("C");
		languageList.add("C++");
		languageList.add("Java");

		for (Iterator<String> languageItr = languageList.iterator(); languageItr
				.hasNext();) {
			String language = languageItr.next();
			System.out.println(language);
		}
	}
}
