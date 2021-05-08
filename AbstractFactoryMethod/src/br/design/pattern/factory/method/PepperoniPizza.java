package br.design.pattern.factory.method;

import br.design.pattern.factory.abstracts.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;

	protected PepperoniPizza(final String name, final PizzaIngredientFactory ingredientFactory) {
		super(name);
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + super.getName());
		super.setDough(this.ingredientFactory.createDough());
		super.setSauce(this.ingredientFactory.createSauce());
		super.setCheese(this.ingredientFactory.createCheese());
		super.setVeggies(this.ingredientFactory.createVeggies());
		super.setPepperoni(this.ingredientFactory.createPepperoni());
	}

}
