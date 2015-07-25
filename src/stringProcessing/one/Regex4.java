package stringProcessing.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
	public static void main(String[] args) {
		String str = "Danny Doo, Flat no 502, Big Apartement, Wide Road, Near Huge MileStrong"
				+ ", Hugo-City 56100, Ph 2134015397, email: dannyword@world.com, Maggi Myer, Post Bag"
				+ "no 52, Big Bank Post Offce, Big Bank City 56000, Ph 2134018499, email: "
				+ "naggi07@myuniverse.com";

		Pattern pattern = Pattern.compile("\\b\\d{5}\\b");
		Matcher matcher = pattern.matcher(str);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
