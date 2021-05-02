package com.ecpe205A;

public class Person {
private int coins,cost;
	
	public Person(int coins) {
		this.setCoins(coins);
		this.cost =3; //1gumball = 3coins
}

	public void insertCoin( Coinable coinable, int coins) {
		System.out.println("\nCoin Inserted = " + coins + " pesos" );
		//condition
		if (coins > 2) {
		if(!coinable.insertCoin()) {
			System.out.println("Coin Refunded = " + coins + " pesos"  );
}
		else {
			coins = coins - cost;
			System.out.println("Change = " + coins + " pesos");
	}
}
		else {
		System.out.println("Amount is not enough " + "\nCoins Returned");
		
	}	
}

	public int getCoins() {
		return coins;
}

	public void setCoins(int coins) {
		this.coins = coins;
	}
}
