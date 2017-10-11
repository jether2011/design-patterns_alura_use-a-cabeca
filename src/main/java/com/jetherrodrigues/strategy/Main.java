package com.jetherrodrigues.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(1000);
		
		List<Imposto> impostos = new ArrayList<>();
		impostos.add(new ISS());
		impostos.add(new ICMS());
		
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		for (Imposto imposto : impostos) {
			calculadoraImposto.realizaCalculo(orcamento, imposto);
		}
	}
}
