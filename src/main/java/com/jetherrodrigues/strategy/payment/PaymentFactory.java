package com.jetherrodrigues.strategy.payment;

public class PaymentFactory {
	public static Payment getPaymentMethod(String type) {
		PaymentMethod paymentMethod = PaymentMethod.getPaymentMethod(type); 
		
		if(paymentMethod == null) {
			throw new IllegalArgumentException("Type of payment not exist!");
		}
		
		return paymentMethod.getPayment();
	}
}
