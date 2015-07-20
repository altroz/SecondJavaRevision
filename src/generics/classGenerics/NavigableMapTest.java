package generics.classGenerics;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
	public static void main(String[] args) {
		NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();

		examScores.put(93, "Sophia");
		examScores.put(80, "Alex");
		examScores.put(65, "Leos");
		examScores.put(95, "Naz");
		examScores.put(89, "Tauha");

		System.out.println("The data in the map: " + examScores);
		System.out.println("The data descending order is: "
				+ examScores.descendingMap());
		System.out.println("Details of those who passed the exam: "
				+ examScores.tailMap(40));
		System.out.println("The lowest mark is: " + examScores.firstEntry());
	}
}
