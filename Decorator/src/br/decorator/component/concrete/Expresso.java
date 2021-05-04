package br.decorator.component.concrete;

import br.decorator.component.Beverage;

public class Expresso extends Beverage {

	public Expresso() {
		super.setDescription("Expresso");
	}

	@Override
	public double cost() {
		double cost = 0.0;
		if (Size.TALL == super.getSize()) {
			cost = 1.99;
		} else if (Size.GRANDE == super.getSize()) {
			cost = 2.04;
		} else if (Size.VENTI == super.getSize()) {
			cost = 2.09;
		}
		return cost;
	}

}
