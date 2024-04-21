package com.poly;

public class ABChild extends ABClass implements IA, IB{

	
	public void displayB() {
		System.out.println("B Display");
	}

	public void displayD() {
		System.out.println("D");
	}

	@Override
	public void displayAA() {
		System.out.println("AA");
		
	}

	@Override
	public void displayAB() {
		System.out.println("AB");
	}

	@Override
	public void displayAC() {
		System.out.println("AC");
	}

	@Override
	public void displayBA() {
		System.out.println("BA");
	}

	@Override
	public void displayBB() {
		System.out.println("BB");
	}

	@Override
	public void displayCA() {
		System.out.println("CA");
	}

}
