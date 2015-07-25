package stringProcessing.one;

public class ParseString2 {
	public static void main(String[] args) {
		String str = "C:\\work\\program\\parsers";
		String[] dirList = str.split("\\\\");
		for (int i = 0; i < dirList.length; i++) {
			System.out.println(dirList[i]);
		}
		System.out.println();
		for (String List : dirList) {
			System.out.println(List);
		}
	}
}
