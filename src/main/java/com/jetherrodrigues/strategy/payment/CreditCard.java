package com.jetherrodrigues.strategy.payment;

public class CreditCard extends Card {
	private final String type = "CreditCard";

	public CreditCard(String nameOnCard, String number, String cvv, String expirationDate) {
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
