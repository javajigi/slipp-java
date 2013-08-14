package net.slipp.thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

public class SynchronizedResultTest extends TestCase {
	public void testResult() throws Exception {
		FileInputStream fis = new FileInputStream("resources/result.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		Map<String, Integer> result = new HashMap<String, Integer>();
		String key = br.readLine();
		while( key != null ) {
			Integer value = result.get(key);
			if (value == null) {
				result.put(key, 1);
			} else {
				result.put(key, value + 1);
			}
			key = br.readLine();
		}
		
		Set<String> keys = result.keySet();
		for (String each : keys) {
			Integer value = result.get(each);
			if (value > 1) {
				System.out.println("index : " + each + " count : " + value);
			}
		}
		
		fis.close();
	}
}
