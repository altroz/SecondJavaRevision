package generics.classGenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {
	public static void printList(List<?> list) {
		for (Object l : list)
			System.out.println("[" + l + "]");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		printList(list);
		List<String> strlist = new ArrayList<>();
		strlist.add("100");
		strlist.add("10");
		printList(strlist);
	}
}
