package innerClass.one;

public class TestOuterClass2 {
	public static void main(String[] args) {
		ExampleOuterClass2 outerClass = new ExampleOuterClass2();
		ExampleOuterClass2.ExampleInnerClass innerClass = outerClass.new ExampleInnerClass();
		innerClass.accessOuter();
		
		ExampleOuterClass2.ExampleInnerClass ic = new ExampleOuterClass2(). new ExampleInnerClass();
		ic.accessOuter();
	}
}
