package stringProcessing.one;

public class SearchString2 {
	public static void main(String[] args) {
		String str = "I am preparing for OCJP";
		System.out.println("substring \"for\" occurs at index: "
				+ (str.indexOf("for") + 1) + "th position");
	}
}
