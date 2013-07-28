package net.slipp.inheritance2;

abstract class Parent {
	private boolean called = false;
	
	Parent() {
		this.called = true;
	}
	
	boolean isCalled() {
		return called;
	}
}
