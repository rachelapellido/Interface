package com.ecpe205A;

public class GumballMachine implements Coinable, Dispensable {
	int gums = 0;
	
	public GumballMachine() {
		this.gums = 10; //amount of gums
}
	@Override
	public void dispensable() {
		// TODO Auto-generated method stub
		this.gums--;
		System.out.println("1 Gum dispensed");
}
	@Override
	public void reload(int count) {
		// TODO Auto-generated method stub
		this.gums += count;
}

	@Override
	public boolean insertCoin() {
		// TODO Auto-generated method stub
		if (this.gums > 0) {
			this.dispensable();
			return true;
}
		System.out.println("Insufficient Gums");
		System.out.println("Return Coin");
		return false;
	}
}
