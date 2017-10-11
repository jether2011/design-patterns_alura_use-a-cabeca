package com.jetherrodrigues.strategy;

public class CalculadoraImposto {
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
}
