package br.decorator.condiments;

import br.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

	private Beverage beverage;

	@Override
	public abstract String getDescription();

	public Beverage getBeverage() {
		return beverage;
	}

}
