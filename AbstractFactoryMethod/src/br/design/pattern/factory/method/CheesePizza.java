package br.design.pattern.factory.method;

import br.design.pattern.factory.abstracts.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;

	public CheesePizza(final String name, final PizzaIngredientFactory ingredientFactory) {
		super(name);
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + super.getName());
		super.setDough(this.ingredientFactory.createDough());
		super.setSauce(this.ingredientFactory.createSauce());
		super.setCheese(this.ingredientFactory.createCheese());

	}

}
