package org.kitsoft.designpatterns.composite.menu;

public abstract class MenuComponent {
	// 공통 연산
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
   
//	// composit을 위한 연산
//	public void add(MenuComponent menuComponent) {
//		throw new UnsupportedOperationException();
//	}
//	public void remove(MenuComponent menuComponent) {
//		throw new UnsupportedOperationException();
//	}
//	public MenuComponent getChild(int i) {
//		throw new UnsupportedOperationException();
//	}
//
//	// leaf를 위한 연산
//	public double getPrice() {
//		throw new UnsupportedOperationException();
//	}
}
