package innerClass.one;

public class Test {
	static class B2 {
		void goB2() {
			System.out.println("Hi2");

		}
	}

	public static void main(String[] args) {
		MyExOuter.MyStaticInner n = new MyExOuter.MyStaticInner();

		n.doSomething();
		B2 b2 = new B2();
		b2.goB2();
	}

}
