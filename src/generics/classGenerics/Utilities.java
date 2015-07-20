package generics.classGenerics;

import java.util.List;

public class Utilities {

	@SuppressWarnings("unchecked")
	public static <T> void fill(List list, T val) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, val);
		}
	}
}
