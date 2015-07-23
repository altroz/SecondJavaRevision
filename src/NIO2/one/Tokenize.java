package NIO2.one;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tokenize {
	public static void main(String[] args) {
		if (args.length != 1)
			System.out
					.println("Pass the name of the file to be read as an arguement");
		System.exit(-1);

		String fileName = args[0];
		Set<String> words = new TreeSet<>();
		try (Scanner tokenizingScanner = new Scanner(new FileReader(fileName))) {
			tokenizingScanner.useDelimiter("\\W");

			while (tokenizingScanner.hasNext()) {
				String word = tokenizingScanner.next();
				if (!word.equals(" ")) {
					words.add(word.toLowerCase());
				}
			}
			for (String word : words) {
				System.out.println(words + "\t");
			}
		} catch (FileNotFoundException fnfe) {
			System.err
					.println("Cannot read the input file - pass a valid fileName");
		}
	}
}
