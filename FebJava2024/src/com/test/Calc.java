package com.test;

public class Calc {

	public static void main(String[] args) {
		System.out.println("Test");
		
		Calc calc1 = new Calc();
		calc1.add();
		
		String name = new String("John Scott");
		int len = name.length();
		char ch = name.charAt(0);
		String name1 = name.concat("Test");
		System.out.println(name.length());
		
	}
	
	public void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

}


// ClassName variable = new ClassName();