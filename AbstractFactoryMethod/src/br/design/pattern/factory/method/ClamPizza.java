package br.design.pattern.factory.method;

import br.design.pattern.factory.abstracts.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;

	protected ClamPizza(final String name, final PizzaIngredientFactory ingredientFactory) {
		super(name);
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + super.getName());
		super.setDough(this.ingredientFactory.createDough());
		super.setSauce(this.ingredientFactory.createSauce());
		super.setCheese(this.ingredientFactory.createCheese());
		super.setClam(this.ingredientFactory.createClam());
	}

}
