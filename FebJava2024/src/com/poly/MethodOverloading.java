package com.poly;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add();
		obj.add(20, 30);
		obj.add(20, 30, 40);
		obj.add(10.00, 20.001);
	}

	public void add() {
		int a = 10;
		int b = 30;
		System.out.println(a+b);
	}
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public void add(int a, double b) {
		System.out.println(a + b);
	}
	
	public void add(double a, int b) {
		System.out.println(a + b);
	}
	
	public void add(String a, String b) {
		System.out.println(a + b);
	}
}

//polymorphism
//method overriding, runtime polymorphism, dynamic binding
//method overloading, compile time polymorphism, static binding

// abstraction
// abstract class -- 0 to 100% abstraction
// interface	-- 100% abstraction
// abstract method -- method without body


