package com.jetherrodrigues.strategy.payment;

public class DebitCard extends Card {
	private final String type = "DebitCard";

	public DebitCard(String nameOnCard, String number, String cvv, String expirationDate) {
		super(nameOnCard, number, cvv, expirationDate);
	}

	@Override
	protected String getType() {
		return this.type;
	}

	@Override
	protected void executeTransaction(double value) {

	}

}
