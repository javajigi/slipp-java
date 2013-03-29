package net.slipp.collection;

import java.util.ArrayList;
import junit.framework.TestCase;

public class ArrayListTest extends TestCase {
	public void testCore() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		
		// assertEquals(2, (  ) ); // list의 크기를 구하라.
		// assertEquals("first", (  ) ); // 첫 번째 값을 찾아라.
		// assertEquals(true, (  ) ); // "first" 값이 포함되어 있는지를 확인해라.
		// assertEquals("first", (  ) ); // 첫 번째 값을 삭제해라.
		// assertEquals(false, (  ) ); // "first" 값이 포함되어 있는지를 확인해라.
	}
}