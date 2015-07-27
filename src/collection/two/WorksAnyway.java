package collection.two;

import java.util.Vector;

public class WorksAnyway {
	public static void main(String[] args) {
		Vector mice = new Vector();
		for (int i = 0; i < 3; i++)
			mice.addElement(new Mouse(i));
		for (int i = 0; i < mice.size(); i++) {
			// Not cast nessage, automatic call to Object.toString();
			System.out.println("Free Mouse: " + mice.elementAt(i));
			MouseTrap.caughtYa(mice.elementAt(i));
		}
	}
}
