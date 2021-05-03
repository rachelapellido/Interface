package com.ecpe205A_ArcadeMachine;

public class TestMachine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome!");
		ArcadeMachine arcadeMachine = new ArcadeMachine();
		Person person = new Person(7);
		
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
	}
}
