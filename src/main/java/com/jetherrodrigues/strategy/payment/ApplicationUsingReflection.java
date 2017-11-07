package com.jetherrodrigues.strategy.payment;

import java.util.Optional;

public class ApplicationUsingReflection {

	private static final String CASH = "com.jetherrodrigues.strategy.payment.Cash";
	private static final String CREDIT = "com.jetherrodrigues.strategy.payment.CreditCard";
	private static final String DEBIT = "com.jetherrodrigues.strategy.payment.DebitCard";
	
	public static void main(String[] args) {
		Bill bill = new Bill();
		bill.addLineItem(new LineItem("Chocolate", 12.05));
		bill.addLineItem(new LineItem("Coffeee", 20.05));
		
		Optional<Payment> optional = RunTimeReflectionPaymentMethodFactory.getPaymentMethod(CASH);
		optional.ifPresent(method -> bill.pay(method));
	}

}
