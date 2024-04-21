package array;

public class StringArray {
	
	public static void main(String[] args) {
		String name = "Java";
		String names[] = new String[5]; // declaration
		names[0] = "Java"; // initialization
		names[1] = "Python";
		names[2] = "Ruby";
		names[3] = "JavaScript";
		names[4] = "C#";

		System.out.println(names[0]);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		for (String name1 : names) {
			System.out.println(name1);
		}
	}

}

// OOPS concepts
// Object
// Class
// Inheritance
// Polymorphism
// Abstraction
// Encapsulation