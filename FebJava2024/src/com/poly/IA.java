package com.poly;

public interface IA extends IC, IB{

	public abstract void displayAA();

	void displayAB();

	void displayAC();
	
	default void displayAD() {
		System.out.println("AD");
	}
	
	static void displayAE() {
		System.out.println("AE");
	}
	
	private void displayAF() {
		System.out.println("AF");
	}
	
}


// 1.7