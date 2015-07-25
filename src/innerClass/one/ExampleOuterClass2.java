package innerClass.one;

public class ExampleOuterClass2 {
	private int x = 7;

	class ExampleInnerClass {
		public void accessOuter() {
			System.out.println("Outer x is: " + x);
		}
	}
}
