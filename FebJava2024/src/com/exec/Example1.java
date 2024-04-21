package com.exec;

public class Example1 {
	
	static String name;
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.display(name);
	}

	
	public void display(String name) throws NullPointerException{
		if (name == null) {
			throw new NullPointerException("Name is null");
		}
		System.out.println(name.length());
		System.out.println(name);
		
	}
}
