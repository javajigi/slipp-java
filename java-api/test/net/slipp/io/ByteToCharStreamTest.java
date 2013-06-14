package net.slipp.io;

import java.io.FileInputStream;

import junit.framework.TestCase;

public class ByteToCharStreamTest extends TestCase {
	public void testCopy() throws Exception {
		FileInputStream fis = ByteToCharStream.getFileInputStream("resources/byte-to_char_source.txt");
		String actual = ByteToCharStream.getData(fis);
		assertEquals("바이트 스트림을 캐릭터 스트림으로 변환", actual);
	}
}
