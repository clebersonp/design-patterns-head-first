package br.design.pattern.factory.method;

import br.design.pattern.factory.abstracts.ChicagoPizzaIngredientFactory;
import br.design.pattern.factory.abstracts.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(final Pizza.Type type) {
		final PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (Pizza.Type.CHEESE.equals(type)) {
			return new CheesePizza("Chicago Style Cheese Pizza", ingredientFactory);
		}
		if (Pizza.Type.VEGGIE.equals(type)) {
			return new VeggiePizza("Chicago Style Veggie Pizza", ingredientFactory);
		}
		if (Pizza.Type.CLAM.equals(type)) {
			return new ClamPizza("Chicago Style Clam Pizza", ingredientFactory);
		}
		if (Pizza.Type.PEPPERONI.equals(type)) {
			return new PepperoniPizza("Chicago Style Pepperoni Pizza", ingredientFactory);
		}
		throw new IllegalArgumentException("Pizza type is invalid!");
	}

}
