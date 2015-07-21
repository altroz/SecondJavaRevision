package InnerClass.one;

public class ExampleOuterClass {
	private int x = 7;

	class ExampleInnerClass {
		public void accessOuter() {
			System.out.println("Outer x is " + x);
		}
	}
}
