package com.constructor;

public class A {

	public A() {
		System.out.println("Default Constructor A");
	}

	public A(int a) {
		System.out.println("Parameterized Constructor A:"+a);
	}


	public A(String name) {
		System.out.println("Parameterized Constructor A:"+	name);
	}

	
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A(10);
		A a2 = new A("John");
		
	}
	

}
