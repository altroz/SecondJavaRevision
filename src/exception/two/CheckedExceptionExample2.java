package exception.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample2 {
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(args[0]);

	}
}
