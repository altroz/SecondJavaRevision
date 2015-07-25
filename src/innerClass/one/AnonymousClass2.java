package innerClass.one;

public class AnonymousClass2 {
	Driveable c = new Driveable() {
		public void drive() {
			System.out.println("Anonymous Drivable Implementer");
		}
	};
}
