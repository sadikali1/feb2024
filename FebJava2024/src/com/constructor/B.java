package com.constructor;

public class B extends A{
	
	public B() {
		System.out.println("Default Constructor B");
	}
	
	public B(int a) {
		super(10);
		System.out.println("Parameterized Constructor B :" + a);
	}
	
	public B(String b) {
		this(10);
		System.out.println("Parameterized Constructor B :" + b);
	}
	
	
	public static void main(String[] args) {
		//B b1 = new B();
		
		B b2 = new B("name");
	}

}


// super 
// this 