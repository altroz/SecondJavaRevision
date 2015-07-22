package exception.one;

import java.util.*;

public class ScanInt4 {
	public void methodOne() {
		Scanner consoleScanner = new Scanner(System.in);
		try {
			System.out.println("You typed the integer value: "
					+ consoleScanner.nextInt());

		} catch (InputMismatchException ime) {
			System.out
					.println("Error: You typed some text that is not an integer value...");
		} catch (Exception e) {
			System.out.println("General Exception Error. ");
		} finally {
			consoleScanner.close();
		}
	}
}
