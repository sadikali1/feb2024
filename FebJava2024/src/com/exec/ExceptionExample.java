package com.exec;

public class ExceptionExample {

	static String name;

	public static void main(String[] args) {
		int a= 20;
		int b = 2;
		int a1[] = new int[5];
		
		try {
			System.out.println(a/b);
			a1[5] = 10;
			System.out.println(name.length());
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
		}catch(NullPointerException e) {
            System.out.println("Null Pointer Exception occured");
		}catch(RuntimeException e) {
            System.out.println("Runtime Exception occured");
		} catch (Exception e) {
			System.out.println("Exception occured");
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Done");

	}

}


// Exception -- 
// Exception handling 	
// try, catch, finally, throw, throws

// Exception types
// RunTimeException (unchecked exception), CompileTimeException( checked exception)