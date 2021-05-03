package com.ecpe205A_ArcadeMachine;

public class Person {
	private int coins;
	public Person(int coins) {
		this.coins = coins;
}
	public void insertCoin(Coinable coinable) {
		 System.out.println("Remaining coins: " + coins + "\n");

		if(!coinable.insertCoin()) 
			coins --;
		
		if (coins == 0)
		 System.out.println("\nInsufficient Balance");
		
	}
}
