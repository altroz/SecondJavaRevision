package exception.one;

public class ChainException {
	public static void foo() {
		try {
			String[] str = { "foo" };
			System.out.println("About to throw ArrayIndexOutOfBoundsException");
			// following statement haas out-of-bound access
			String functionName = str[10];
		} catch (ArrayIndexOutOfBoundsException oob) {
			System.out
					.println("Wrapping ArrayIndexOutOfBoundException into a RuntimeException");
			throw new RuntimeException(oob);
		}
	}

	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception re) {
			System.out.println("The caught exception in main is: "
					+ re.getClass());
			System.out.println("The cause of the exception is: "
					+ re.getCause());
		}

	}
}
