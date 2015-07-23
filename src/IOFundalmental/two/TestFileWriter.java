package IOFundalmental.two;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) {
		char[] in = new char[50];
		int size = 0;

		try {
			File file = new File("MySecondFile.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("Hello World !");
			fw.flush();
			fw.close();

			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.println(size + " ");
			for (char c : in)
				System.out.println(c);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
