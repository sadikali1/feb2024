package inheritance;


public class Test {

	public static void main(String[] args) {
		/*
		A a = new A();
		a.display();
		
		B b = new B();
		b.print();
		b.display();*/
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
		dog.run();
		
		Cat cat = new Cat();
		cat.meow();
		cat.run();
		cat.eat();
		
	}

}


// A parent class, superclass, base class
// B (cat, dog, tiger)-- child of A, subclass of A, derived class of A

// type of inheritance
// 1. Single inheritance
// 2. Multilevel inheritance
// 3. Hierarchical inheritance
// 4. Multiple inheritance
// 5. Hybrid inheritance


