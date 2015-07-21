package InnerClass.one;

public class ExampleOuterTest {
	public static void main(String[] args) {
		ExampleOuterClass1 oc = new ExampleOuterClass1();
		ExampleOuterClass1.ExampleInnerClass ic = oc.new ExampleInnerClass();

		ic.accessOuter();
	}
}
