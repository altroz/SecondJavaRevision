package assertion.one;

public class TypeTwoAssertion {

	int x, y;

	public void methodOne() {

		assert (y > x) : "y is " + y + "x is " + x;
	}
}
