package com.jetherrodrigues.strategy.payment;

public class LineItem {
	private String description;
	private double costInCents;

	public LineItem(String description, double costInCents) {
		this.description = description;
		this.costInCents = costInCents;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCostInCents() {
		return costInCents;
	}

	public void setCostInCents(double costInCents) {
		this.costInCents = costInCents;
	}
}