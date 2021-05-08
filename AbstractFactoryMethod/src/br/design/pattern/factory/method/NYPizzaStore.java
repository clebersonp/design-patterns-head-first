package br.design.pattern.factory.method;

import br.design.pattern.factory.abstracts.NYPizzaIngredientFactory;
import br.design.pattern.factory.abstracts.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(final Pizza.Type type) {
		final PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if (Pizza.Type.CHEESE.equals(type)) {
			return new CheesePizza("New York Style Cheese Pizza", ingredientFactory);
		}
		if (Pizza.Type.VEGGIE.equals(type)) {
			return new VeggiePizza("New York Style Veggie Pizza", ingredientFactory);
		}
		if (Pizza.Type.CLAM.equals(type)) {
			return new ClamPizza("New York Style Clam Pizza", ingredientFactory);
		}
		if (Pizza.Type.PEPPERONI.equals(type)) {
			return new PepperoniPizza("New York Style Pepperoni Pizza", ingredientFactory);
		}
		throw new IllegalArgumentException("Pizza type is invalid!");
	}

}
