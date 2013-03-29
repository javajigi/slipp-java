package net.slipp.lang;

import java.util.ArrayList;

import junit.framework.TestCase;

public class ForTest extends TestCase {
	public void testFor1() throws Exception {
		int size = 10;
		for (int i = 0; i < size; i++) {
		}
	}
	
	public void testFor2() throws Exception {
		ArrayList<String> values = new ArrayList<String>();
		for (String value : values) {
		}
	}
}
