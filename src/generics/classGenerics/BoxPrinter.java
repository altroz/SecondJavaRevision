package generics.classGenerics;

public class BoxPrinter<T> {
	private T value;

	public BoxPrinter(T args) {
		value = args;
	}

	public String toString() {
		return "[" + value + "]";
	}
}
