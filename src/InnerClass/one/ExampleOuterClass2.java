package InnerClass.one;



public class ExampleOuterClass2 {
	private int x = 7;
	public void instantiateInnerClass(){
		ExampleInnerClass in = new ExampleInnerClass();
		in.accessOuter();
	}
	class ExampleInnerClass{
		public void accessOuter(){
		System.out.println("Outer x is "+ x);
		System.out.println("Inner ref is "+ this);
		System.out.println("Outer red is "+ ExampleOuterClass2.this);
		}
	}
}
