package com.test;

public class Students {

	String name;
	String email;
	long phoneNUmber;
	static String code = "A100";
	
	public static void main(String[] args) {
		Students obj1 = new Students();
		obj1.name = "Rajesh";
		obj1.email = "Rajesh@test.com";
		obj1.phoneNUmber = 792539595L;
			
		Students obj2 = new Students();
		
		System.out.println(obj1.name + " " + obj1.email + " "+ obj1.phoneNUmber);
		System.out.println(obj2.name + " " + obj2.email + " "+ obj2.phoneNUmber);
	}
	
	
}

//Variables -- 
//Three types 
	// Instance / non static
	// static
	// Local


// Control statements
// Conditional statements
	// if, else if, else
	// switch
// Looping statements
    // for, while, do while