package fileNavigation.One;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Type {
	public static void main(String[]files){
		if(files.length == 0){
			System.out.println("Pass the name of the file as arguement");
			System.exit(-1);
		}
		for(String file : files){
			try(FileReader inputFile = new FileReader(file)){
				int ch = 0;
				while((ch = inputFile.read())!= -1){
					System.out.println((char)ch);
				}
				
			}catch(FileNotFoundException fnfe){
				System.out.printf("Cannot open the given file %s", file);
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
}
