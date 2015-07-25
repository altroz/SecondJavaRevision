package innerClass.one;

public class MyExOuterClass {
	void doSomething() {
		String x = "Outer";

		class InnerClass {
			public void accessOuter() {
				System.out.println("Outer x is " + x);
			}
		}
		InnerClass inner = new InnerClass();
		inner.accessOuter();
	}
}
