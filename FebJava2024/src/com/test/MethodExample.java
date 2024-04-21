package com.test;

public class MethodExample {

	public static void main(String[] args) {
		
		MethodExample me = new MethodExample();
		me.checkNumber(100);
		me.checkNumber(200);
		me.checkNumber(101);
		
		int result = me.calc(10, 20, '+');
		System.out.println("result: " + result);		
		int result1 = me.calc(10, 20, '-');
		System.out.println("result1: " + result1);
		int result2 = me.calc(10, 20, '*');
		System.out.println("result2: " + result2);
		int result3 = me.calc(10, 20, '/');
		System.out.println("result3: " + result3);
		
	}
	
	
	public void checkNumber(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is Even Number");
        } else {
            System.out.println(a + " is Odd Number");
        }
	}
	
	public int calc(int a, int b, char symbol) {
		int result = 0;
		if (symbol == '+') {
			result = a + b;
		} else if (symbol == '-') {
			result = a - b;
		} else if (symbol == '*') {
			result = a * b;
		} else if (symbol == '/') {
			result = a / b;
		} else {
			System.out.println("Invalid Symbol");
		}
		return result;
		
	}
	
	
	public void enterText(String text) {
		//
	}
	
	public String getResult() {
		// read text left here
		return "Hello";
	}
}
