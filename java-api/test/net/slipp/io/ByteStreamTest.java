package net.slipp.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

import junit.framework.TestCase;

public class ByteStreamTest extends TestCase {
	public void testCopy() throws Exception {
		String source = "resources/byte-source.txt";
		String target = "resources/byte-target.txt";
		ByteStream.copyFile(source, target);
		
		File targetFile = new File(target);
		assertEquals(true, targetFile.exists());
	}
	
	public void testDecoratorPattern() throws Exception {
		FileInputStream fis = new FileInputStream("resources/byte-source.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		InputStreamReader isr = new InputStreamReader(bis);

		StringWriter sw = new StringWriter();
		int data;
		while ( (data = isr.read()) != -1) {
			sw.write(data);
		}
		System.out.println(sw.toString());
	}
}
