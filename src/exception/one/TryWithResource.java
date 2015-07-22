package exception.one;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console: ");
		try (Scanner consoleScanner = new Scanner(System.in)) {
			System.out.println("You typed the integer value: "
					+ consoleScanner.nextInt());
		} catch (Exception e) {
			System.out.println("Error: Encounted an exception ");
			System.out.println("Exiting the program");
		}

	}
}
