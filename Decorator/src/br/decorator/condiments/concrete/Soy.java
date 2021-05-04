package br.decorator.condiments.concrete;

import br.decorator.component.Beverage;
import br.decorator.condiments.CondimentDecorator;

public class Soy extends CondimentDecorator {

	private Beverage beverage;

	public Soy(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = this.beverage.cost();
		if (Size.TALL == this.beverage.getSize()) {
			cost += .15;
		} else if (Size.GRANDE == this.beverage.getSize()) {
			cost += .20;
		} else if (Size.VENTI == this.beverage.getSize()) {
			cost += .25;
		}
		return cost;
	}

}
