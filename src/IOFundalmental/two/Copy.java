package IOFundalmental.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] files) {
		if (files.length != 2) {
			System.err
					.println("Incorrect syntax. Correct Syntax: Copy srcFile destFile");
			System.exit(-1);
		}

		String srcFile = files[0];
		String dstFile = files[1];

		try (BufferedReader inputFile = new BufferedReader(new FileReader(
				srcFile));
				BufferedWriter outputFile = new BufferedWriter(new FileWriter(
						dstFile))) {
			int ch = 0;
			while ((ch = inputFile.read()) != -1) {
				outputFile.write((char) ch);
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
