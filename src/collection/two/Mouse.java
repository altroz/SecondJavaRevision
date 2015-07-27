package collection.two;

public class Mouse {
	private int mouseNumber;

	Mouse(int i) {
		mouseNumber = i;
	}

	public String toString() {
		return "This is Mouse#: " + mouseNumber;
	}

	void print(String msg) {
		if (msg != null)
			System.out.println(msg);
		System.out.println("Mouse nunber " + mouseNumber);
	}
}
