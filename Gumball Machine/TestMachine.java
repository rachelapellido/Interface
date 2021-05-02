package com.ecpe205A;

public class TestMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  GUMBALL MACHINE      ");
		System.out.println("1 GUMBALL = 3 pesos ");
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person (5);
		
		person.insertCoin(gumballMachine, 9);
		person.insertCoin(gumballMachine, 15);
		person.insertCoin(gumballMachine, 6);
		person.insertCoin(gumballMachine, 2);
		person.insertCoin(gumballMachine, 3);
		

	}
}
