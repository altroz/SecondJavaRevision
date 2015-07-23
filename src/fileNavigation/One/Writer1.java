package fileNavigation.One;

import java.io.File;

public class Writer1 {
	public static void main(String[] args) {
		boolean newFile = false;
		try {
			File file = new File("myFirstFile.txt");
			newFile = file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
		} catch (Exception e) {
			System.out.println("File could be created");
		}
	}
}