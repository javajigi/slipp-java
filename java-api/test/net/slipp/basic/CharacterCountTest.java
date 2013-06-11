package net.slipp.basic;

import junit.framework.TestCase;

public class CharacterCountTest extends TestCase {
	public void testCountChars() throws Exception {
		assertEquals(3, countChars("abcadfafg", 'a'));
	}

	public static int countChars(String input, char ch) {
		int count;
		int i;
		for (i = 0, count = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch)
				count++;
		}
		return count;
	}
}
