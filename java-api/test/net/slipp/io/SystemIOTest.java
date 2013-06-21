package net.slipp.io;

import junit.framework.TestCase;

public class SystemIOTest extends TestCase {
	public void testSystemIO() throws Exception {
		int input = 0;
		while( (input =System.in.read()) != -1) {
			System.out.println("input : " + input + ", (char)input : " + (char)input);
		}
	}
}
