package net.slipp.inheritance;

class Parent {
	private boolean called = false;
	
	Parent() {
		this.called = true;
	}
	
	boolean isCalled() {
		return called;
	}
}
