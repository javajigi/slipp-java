package net.slipp.polymorphism;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {
	public void testShape() {
		Shape circle = new Circle();
		assertEquals("draw Circle", circle.draw());

		Shape rectangle = new Rectangle();
		assertEquals("draw Rectangle", rectangle.draw());

		Shape triangle = new Triangle();
		assertEquals("draw Triangle", triangle.draw());
	}
}
