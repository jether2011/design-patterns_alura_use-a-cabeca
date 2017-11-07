package com.jetherrodrigues.strategy.payment;

import java.util.Optional;

public class RunTimeReflectionPaymentMethodFactory {
	public static Optional<Payment> getPaymentMethod(String qualifiedName) {
		try {
			Class<?> clazz = Class.forName(qualifiedName);
			Payment method = (Payment) clazz.newInstance();
			return Optional.of(method);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ClassCastException e) {
			return Optional.empty();
		}
	}
}
