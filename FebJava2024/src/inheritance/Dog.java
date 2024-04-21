package inheritance;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog is barking");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 25;
		int c = 55;
		if (a % 2 == 0) {
			System.out.println("a is Even Number");

			if (b > c) {
				System.out.println("b is greater");
			} else {
				System.out.println("c is greater");
			}
		} else {
			System.out.println("a is Odd Number");
		}
		System.out.println("done");

	}
}
