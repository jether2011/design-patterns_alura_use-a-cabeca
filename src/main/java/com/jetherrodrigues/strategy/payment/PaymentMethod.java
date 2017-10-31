package com.jetherrodrigues.strategy.payment;

public enum PaymentMethod {
	CREDIT(){
		public Payment getPayment() {
			return new CreditCard("Jether Rodrigues Nascimento", "11111111", "777", "2017-11-2020");
		}
	},
	DEBIT(){
		public Payment getPayment() {
			return new DebitCard("Jether Rodrigues Nascimento", "22222222", "888", "2017-11-2020");
		}
	},
	CASH(){
		public Payment getPayment() {
			return new Cash();
		}
	};
	
	private String value;

	public String getValue() {
		return value;
	}
	
	public Payment getPayment() {
		return null;
	}
	
	public static PaymentMethod getPaymentMethod(String value) {
		for(PaymentMethod paymentMethod : PaymentMethod.values()) {
			if(value.equals(paymentMethod.name())) {
				return paymentMethod;
			}
		}
		return null;
	}
}
