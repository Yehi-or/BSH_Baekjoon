package Backjoon.Test;

public class Test1 {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.getX());
		
	}

}

class Parent {
	int x = 100;

	Parent() {
		this(500);
		System.out.println("parentStart");
	}

	Parent(int x) {
		System.out.println("parentChange");
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 4000;

	Child() {
		this(5000);
		System.out.println("childStart");
	}

	Child(int x) {
		System.out.println("childChange");
		this.x = x;
	}
}
