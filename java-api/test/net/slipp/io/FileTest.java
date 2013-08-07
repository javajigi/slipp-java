package net.slipp.io;

import java.io.File;

import junit.framework.TestCase;

public class FileTest extends TestCase {
	public void testMove() throws Exception {
		String source = "resources/move_before.txt";
		String target = "resources/move_after.txt";
		FileUtils.moveFileFile(source, target);
		
		File targetFile = new File(target);
		assertEquals(true, targetFile.exists());
		
	}
}
