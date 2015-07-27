package collection.two;

import java.util.Enumeration;
import java.util.Vector;

public class CatsAndDogs2 {
	public static void main(String[] args) {
		Vector cats = new Vector();
		for (int i = 0; i < 7; i++)
			cats.addElement(new Cat2(i));
		// Not a problem to add a dog to cats:
		cats.addElement(new Dog2(7));
		Enumeration e = cats.elements();
		while (e.hasMoreElements())
			((Cat2) e.nextElement()).print();
		// Dog is detected only at run-time
	}
}
