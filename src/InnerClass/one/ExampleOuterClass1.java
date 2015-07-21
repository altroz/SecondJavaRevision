package InnerClass.one;

public class ExampleOuterClass1 {
	private int x = 7;

	public void instatiateInnerClass() {
		ExampleInnerClass in = new ExampleInnerClass();
		in.accessOuter();
	}

	class ExampleInnerClass {
		public void accessOuter() {
			System.out.println("Outer x is: " + x);
		}
	}
}
