package exception.one;

import java.util.*;

public class ScanInt3 {
	public static void main(String[] args) {
		String integerStr = "100";

		System.out.println("The string to scan integer from it is: "
				+ integerStr);
		Scanner consoleScanner = new Scanner(integerStr);

		try {
			System.out.println("The integer value scanner from string is: "
					+ consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			System.out
					.println("Error: cannot scan an integer from the given string.");
			ime.printStackTrace();
		} catch (NoSuchElementException nsee) {
			System.out
					.println("Error: cannot scan an integer from the given string.");
			nsee.printStackTrace();
		} catch (IllegalStateException ise) {
			System.out
					.println("Error: nextInt() called on a close Scanner object.");
			ise.printStackTrace();
		}

		finally {
			consoleScanner.close();
		}
	}
}
