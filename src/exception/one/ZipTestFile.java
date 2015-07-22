package exception.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTestFile {
	public static final int CHUNK = 1024;

	// to help copy chunk of 1KB.

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out
					.println("Pass the name of the file in the current directory to be zipped as an argument");
			System.exit(-1);
		}
		String fileName = args[0];
		// name of the zipfile is the input file name with the suffix ".zip"
		String zipFileName = fileName + ".zip";
		byte[] buffer = new byte[CHUNK];
		// these constructors can throw FileNotFoundException

		try (ZipOutputStream zipFile = new ZipOutputStream(
				new FileOutputStream(zipFileName));
				FileInputStream fileIn = new FileInputStream(fileName)) {
			zipFile.putNextEntry(new ZipEntry(fileName));
			int lenRead = 0;

			while ((lenRead = fileIn.read(buffer)) > 0) {
				zipFile.write(buffer, 0, lenRead);
			}
		} catch (Exception e) {
			System.out.println("The caught exception is " + e);
			System.out.println("The suppressed exception are");

			for (Throwable suppressed : e.getSuppressed()) {
				System.out.println(suppressed);
			}
		}
	}
	
}
