package net.slipp.io;

import java.io.File;

import junit.framework.TestCase;

public class CharStreamTest extends TestCase {
	public void testCopy() throws Exception {
		String source = "resources/byte-source.txt";
		String target = "resources/byte-target.txt";
		CharStream.copyFile(source, target);
		
		File targetFile = new File(target);
		assertEquals(true, targetFile.exists());
	}
}