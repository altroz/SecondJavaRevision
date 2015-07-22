package exception.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error: no file found");
			System.out.println("Pass a valid file name");
		}
	}
}
