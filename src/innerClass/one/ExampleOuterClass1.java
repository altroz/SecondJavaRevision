package innerClass.one;

public class ExampleOuterClass1 {
	private int x = 7;

	class ExampleInnerClass {
		public void accessOuter() {
			System.out.println("Outer x is " + x);
		}
	}

	public void instatiateInnerClass() {
		ExampleInnerClass in = new ExampleInnerClass();
		in.accessOuter();
	}
}
