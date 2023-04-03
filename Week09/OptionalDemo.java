package week09codes;

import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {

	public static Optional<String> searchWordWithPrefix(String text, String prefix) {
		StringTokenizer st = new StringTokenizer(text, " ");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (token.toLowerCase().startsWith(prefix.toLowerCase())) {
				return Optional.of(token);
			}
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		String text = "Today is a rainy day.";
		String prefix1 = "day";
		String prefix2 = "to";
		String prefix3 = "ada";

		Optional<String> result1 = searchWordWithPrefix(text, prefix1);
		Optional<String> result2 = searchWordWithPrefix(text, prefix2);
		Optional<String> result3 = searchWordWithPrefix(text, prefix3);

		result1.ifPresentOrElse(value -> System.out.println("Word with prefix \"" + prefix1 + "\": " + value),
				() -> System.out.println("No word found with prefix \"" + prefix1 + "\""));

		result2.ifPresentOrElse(value -> System.out.println("Word with prefix \"" + prefix2 + "\": " + value),
				() -> System.out.println("No word found with prefix \"" + prefix2 + "\""));

		result3.ifPresentOrElse(value -> System.out.println("Word with prefix \"" + prefix3 + "\": " + value),
				() -> System.out.println("No word found with prefix \"" + prefix3 + "\""));
	}
}