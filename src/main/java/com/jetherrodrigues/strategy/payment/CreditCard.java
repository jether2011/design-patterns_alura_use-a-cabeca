package com.jetherrodrigues.strategy.payment;

public class CreditCard extends Card {

	public CreditCard(String nameOnCard, String number, String cvv, String expirationDate) {
		super(nameOnCard, number, cvv, expirationDate);
	}

	@Override
	protected String getType() {
		return "CreditCard";
	}

	@Override
	protected void executeTransaction(double value) {

	}

}
