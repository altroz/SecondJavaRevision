package stringProcessing.one;

public class SearchString3 {
	public static void main(String[] args) {
		String str = "I am a student. I am preparing for OCJP";

		int fromIndex = 0;
		while (str.indexOf("am", fromIndex) > -1) {
			fromIndex = str.indexOf("am", fromIndex);
			System.out
					.println("Substring \"am\" occurs at index: " + fromIndex);
			fromIndex++;
		}
	}
}
