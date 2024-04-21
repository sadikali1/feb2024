package com.constructor;

public class Students {
	
	private String name;
	private int rollNo;
	private int age;
	private String address;
	
	public Students() {
		System.out.println("Default Constructor");
	}
	
	public Students(String name, int rollNo, int age, String address) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.address = address;
	}
	
	
	public static void main(String[] args) {
       Students s1 = new Students("John", 101, 20, "Bangalore");
       System.out.println("Student 1 Details: ");
       //s1.name = "John";
       //s1.rollNo = 101;
       //s1.age = 20;
       //s1.address = "Bangalore";
       s1.display();
       
       Students s2 = new Students("Mike", 102, 21, "Chennai");
       System.out.println("Student 2 Details: ");
       //s2.name = "Mike";
       //s2.rollNo = 102;
       //s2.age = 21;
       //s2.address = "Chennai";
       s2.display();
       
       
       Students s3 = new Students("David", 103, 22, "Hyderabad");
       //s3.name = "David";
       ///s3.rollNo = 103;
       //s3.age = 22;
      // s3.address = "Hyderabad";
       System.out.println("Student 3 Details: ");
       s3.display();
        
    }
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}

}
