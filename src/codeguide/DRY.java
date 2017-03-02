package codeguide;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The class is count how many words in charactor.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class DRY {
	/**
	 * The method read words from an input stream and count how many words in
	 * first charactor with 'a' , 'b' , ... that actually occurs at the start of
	 * one or more words.
	 */
	public static Map<Character, Integer> frequencyCount(InputStream input) {
		Scanner word = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();
		while (word.hasNext()) {
			String text = word.nextLine();
			// TODO rewrite code that not duplicate code.
			if (!map.containsKey(text.charAt(0))) {
				map.put(text.charAt(0), 1);
			} else {
				map.put(text.charAt(0), map.get(text.charAt(0)) + 1);
			}
		}
		return map;
	}
}