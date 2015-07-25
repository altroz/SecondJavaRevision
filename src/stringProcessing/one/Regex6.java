package stringProcessing.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
	public static void main(String[] args) {
		String str = "Danny Doo, Flat no 502, Big Apartement, Wide Road, Near Huge MileStrong"
				+ ", Hugo-City 56100, Ph 2134015397, email: dannyword@world.com, Maggi Myer, Post Bag"
				+ "no 52, Big Bank Post Offce, Big Bank City 56000, Ph 2134018499, email: "
				+ "naggi07@myuniverse.com";

		Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
		Matcher matcher = pattern.matcher(str);

		String newStr = matcher.replaceAll("$1$2-$3$4");
		System.out.println(newStr);
	}
}
