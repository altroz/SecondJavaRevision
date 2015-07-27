package collection.two;

public class Gopher {
	private int gopherNumber;

	Gopher(int i) {
		gopherNumber = i;
	}

	void print(String msg) {
		if (msg != null)
			System.out.println(msg);
		System.out.println("Gopher number " + gopherNumber);
	}
}
