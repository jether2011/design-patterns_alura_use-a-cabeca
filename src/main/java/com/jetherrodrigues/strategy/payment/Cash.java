package com.jetherrodrigues.strategy.payment;

public class Cash implements Payment {

	@Override
	public void pay(double money) {
		System.out.printf("Payed %s using cash. \n", money);
	}
}
