package net.slipp.lang;

import junit.framework.TestCase;

public class StringPerformanceTest extends TestCase {
	public void testString1() throws Exception {
		final int COUNT = 10000;
		String s1 = "Hello";
		String s2 = "World";

		long start = System.currentTimeMillis();
		for (int i=0; i<COUNT; i++) {
		    s1 = s1 + s2;
		}
		long end = System.currentTimeMillis();
		System.out.println("Operator TIME : " + (end-start));		
	}
	
	public void testStringConcat() throws Exception {
		final int COUNT = 10000;
		String s1 = "HelloHelloHelloWorldWorld";
		String s2 = "WorldWorldWorldWorldWorld";
		long start = System.currentTimeMillis();
		for (int i=0; i<COUNT; i++) {
		    s1 = s1.concat(s2);
		}
		long end = System.currentTimeMillis();
		System.out.println("Concat TIME : " + (end-start));		
	}
	
	public void testStringBufferAppend() throws Exception {
		final int COUNT = 10000;
		String s1 = "HelloHelloHelloWorldWorld";
		String s2 = "WorldWorldWorldWorldWorld";
		long start = System.currentTimeMillis();
		StringBuffer buffer1 = new StringBuffer(s1);
		StringBuffer buffer2 = new StringBuffer(s2);

		for (int i=0; i<COUNT; i++) {
		    buffer1.append(buffer2);
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer TIME : " + (end-start));		
	}
	
	public void testSBuilderAppend() throws Exception {
		final int COUNT = 10000;
		String s1 = "HelloHelloHelloWorldWorld";
		String s2 = "WorldWorldWorldWorldWorld";
		long start = System.currentTimeMillis();
		StringBuilder builer1 = new StringBuilder(s1);
		StringBuilder builer2 = new StringBuilder(s2);
		for (int i=0; i<COUNT; i++) {
		    builer1.append(builer2);
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder TIME : " + (end-start));		
	}
}
