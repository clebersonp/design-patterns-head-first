package br.decorator.component.concrete;

import br.decorator.component.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super.setDescription("House Blend Coffee");
	}

	@Override
	public double cost() {
		double cost = 0.0;
		if (Size.TALL == super.getSize()) {
			cost = .89;
		} else if (Size.GRANDE == super.getSize()) {
			cost = .94;
		} else if (Size.VENTI == super.getSize()) {
			cost = .99;
		}
		return cost;

	}

}
