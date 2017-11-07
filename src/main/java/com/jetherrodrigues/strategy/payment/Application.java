package com.jetherrodrigues.strategy.payment;

public class Application {

	public static void main(String[] args) {
		Bill bill = new Bill();
		bill.addLineItem(new LineItem("Chocolate", 12.05));
		bill.addLineItem(new LineItem("Coffeee", 20.05));
		
		bill.pay(PaymentFactory.getPaymentMethod(PaymentMethod.CASH.name()));
		bill.pay(PaymentFactory.getPaymentMethod(PaymentMethod.CREDIT.name()));
		bill.pay(PaymentFactory.getPaymentMethod(PaymentMethod.DEBIT.name()));
		
		
	}

}
