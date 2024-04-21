package com.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a>b && b++>c);   // false && true = false
		 									// true && false = false
											// false && false = false
											// true && true = true
		
		System.out.println(b);
		
		
		//System.out.println(a<b || b<c);     // false && true = true
											// true && false = true
											// false && false = false
											// true && true = true
	}

}

// &&, ||
// &, |
