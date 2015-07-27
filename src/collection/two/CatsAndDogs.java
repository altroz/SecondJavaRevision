package collection.two;

import java.util.Vector;

public class CatsAndDogs {
	public static void main(String[] args) {
		Vector cats = new Vector();
		for (int i = 0; i < 7; i++) {
			cats.addElement(new Cat[i]);
			// not a problem to add a dog to cats:
			//cats.addElement(new Dog(7));
			for (i = 0; i < 7; i++)
				((Cat) cats.elementAt(i)).print();
			// Dog is detected only at runtime.
		}
	}
}
