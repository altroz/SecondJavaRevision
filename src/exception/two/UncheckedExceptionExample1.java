package exception.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UncheckedExceptionExample1 {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("No error: No arguement");
			System.out.println("Pass the name of the file");
		}
	}
}
