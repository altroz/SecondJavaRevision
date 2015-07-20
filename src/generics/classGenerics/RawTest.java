package generics.classGenerics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest {
	public static void main(String[] args) {
		List<String> list = new LinkedList();
		list.add("First");
		list.add("Second");
		list.add("Third");

		List<String> strList = list;

		for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();) {
			System.out.println("Item: " + itemItr.next());
		}

		List list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> strList1 = list1;
		for (Iterator<Integer> itemItr2 = strList1.iterator(); itemItr2
				.hasNext();) {
			System.out.println("Item: " + itemItr2.next());
		}
	}
}
