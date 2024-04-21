package com.poly;

public abstract class ABClass {

	String name = "ABClass";
	int age = 10;

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public abstract void displayB();

	public void displayC() {
		System.out.println("C");
	}

	public abstract void displayD();

	public void displayE() {
		System.out.println("E");
	}

}

