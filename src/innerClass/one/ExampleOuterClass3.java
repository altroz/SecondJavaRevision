package innerClass.one;

public class ExampleOuterClass3 {
	private int x = 7;

	public void instantiateInnerClass() {
		ExampleInnerClass in = new ExampleInnerClass();
		in.accessOuter();
	}

	class ExampleInnerClass {
		public void accessOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner Ref is " + this);
			System.out.println("Outer ref is " + ExampleOuterClass3.this);
		}
	}

	public static void main(String[] args) {
		ExampleOuterClass3.ExampleInnerClass ic = new ExampleOuterClass3().new ExampleInnerClass();
		ic.accessOuter();
	}
}
