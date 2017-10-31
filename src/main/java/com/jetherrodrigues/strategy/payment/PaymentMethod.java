package com.jetherrodrigues.strategy.payment;

public enum PaymentMethod {
	CREDIT(){
		
	},
	DEBIT(){
		
	},
	CASH(){
		
	};
	
	private String value;

	public String getValue() {
		return value;
	}
	
}
