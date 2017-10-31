package com.jetherrodrigues.strategy.payment;

import com.jetherrodrigues.util.GsonSingleton;

public abstract class Card implements Payment {
	private final String nameOnCard;
	private final String number;
	private final String cvv;
	private final String expirationDate;

	public Card(String nameOnCard, String number, String cvv, String expirationDate) {
		this.nameOnCard = nameOnCard;
		this.number = number;
		this.cvv = cvv;
		this.expirationDate = expirationDate;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public String getNumber() {
		return number;
	}

	public String getCvv() {
		return cvv;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	@Override
	public void pay(double money) {
		System.out.printf("Payed %s using %s. \n", money, toString());
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}

	protected abstract String getType();

	protected abstract void executeTransaction(double value);
}
