package net.slipp.reflection;

import java.lang.reflect.Method;

import org.junit.Test;

public class Junit3Runner {
	@Test
	public void runner() throws Exception {
		Class<Junit3Test> clazz = Junit3Test.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("method : " + method.getName());
			method.invoke(clazz.newInstance());
		}
	}

}
