package fileNavigation.One;

import java.io.File;
import java.io.IOException;

public class FileTesting {
	public static void main(String[]args){
			try{
			File Folder= new File("Company Folder");
			Folder.mkdir();
			File CompanyText = new File("Company Folder", "Company Text.txt");
			CompanyText.createNewFile();
			System.out.println(CompanyText.exists());
			File CompanyText1 = new File("Company Folder", "Company Text 1. txt");
			CompanyText1.createNewFile();
			System.out.println(CompanyText1.exists());
			CompanyText.delete();
			System.out.println("CompanyText: "+ CompanyText.exists()); // Should return False. 
			}
			catch(IOException e){
				e.printStackTrace();
				System.out.println("Error: Please check the codes.");
			}
			
	}
}
