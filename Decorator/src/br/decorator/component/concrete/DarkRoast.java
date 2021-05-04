package br.decorator.component.concrete;

import br.decorator.component.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		super.setDescription("Dark Roast Coffee");
	}

	@Override
	public double cost() {
		double cost = 0.0;
		if (Size.TALL == super.getSize()) {
			cost = .99;
		} else if (Size.GRANDE == super.getSize()) {
			cost = 1.04;
		} else if (Size.VENTI == super.getSize()) {
			cost = 1.09;
		}
		return cost;
	}

}
