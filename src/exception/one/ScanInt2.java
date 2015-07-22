package exception.one;

import java.util.*;

public class ScanInt2 {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in);

		try {
			System.out.println("You typed the integer value: "
					+ consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			// .nextInt() thows InputMismatchException in case anything other
			// than an integer
			// is typed in the console; so handle it.
			System.out
					.println("Error: You typed some text that is not an integer value...");

			// Accessing the stack trace.
			ime.printStackTrace();
			// Alternative ways to call the stack trace.
			// access each elements in the "call stack" and print them
			// individually.
			for (StackTraceElement methodCall : ime.getStackTrace()) {
				System.out.println(methodCall);
			}
		}

		finally {
			consoleScanner.close();
		}
	}

}
