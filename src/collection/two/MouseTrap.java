package collection.two;

public class MouseTrap {
	static void caughtYa(Object m){
		Mouse mouse = (Mouse)m; // cast from object
		mouse.print("Caught one");
	}
}
