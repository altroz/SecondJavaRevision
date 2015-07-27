package collection.two;

import java.util.Enumeration;

public class Printer {
	static void printAll(Enumeration e) {
		while (e.hasMoreElements())
			System.out.println(e.nextElement().toString());
	}
}
