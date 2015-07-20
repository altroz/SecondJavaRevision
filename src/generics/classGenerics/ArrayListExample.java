package generics.classGenerics;

import java.util.ArrayList;

public class ArrayListExample {
	public void languageSelection(){
	ArrayList<String>languageList = new ArrayList<String>();
	languageList.add("C");
	languageList.add("C++");
	languageList.add("Java");
	
	for(String language: languageList){
		System.out.println(language);
	}
	}
}
