package org.test;

public class ClassB extends ClassA{
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("MethodC");

	}

	public void methodD() {
		// TODO Auto-generated method stub
		System.out.println("MethodD");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inherA");
		ClassB objB = new ClassB();
		objB.methodA();
		objB.methodB();
		objB.methodC();
	}

}
