package exception.two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowClause3 {
	public int readIntFromFile() throws FileNotFoundException {
		Scanner consoleScanner = new Scanner(new File("integer.txt"));
		return consoleScanner.nextInt();

	}
}
