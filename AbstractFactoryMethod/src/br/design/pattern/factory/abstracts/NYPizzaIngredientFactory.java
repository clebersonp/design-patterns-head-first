package br.design.pattern.factory.abstracts;

import br.design.pattern.factory.abstracts.ingredients.Cheese;
import br.design.pattern.factory.abstracts.ingredients.Clams;
import br.design.pattern.factory.abstracts.ingredients.Dough;
import br.design.pattern.factory.abstracts.ingredients.FreshClams;
import br.design.pattern.factory.abstracts.ingredients.Garlic;
import br.design.pattern.factory.abstracts.ingredients.MarinaraSauce;
import br.design.pattern.factory.abstracts.ingredients.Mushroom;
import br.design.pattern.factory.abstracts.ingredients.Onion;
import br.design.pattern.factory.abstracts.ingredients.Pepperoni;
import br.design.pattern.factory.abstracts.ingredients.RedPepper;
import br.design.pattern.factory.abstracts.ingredients.ReggianoCheese;
import br.design.pattern.factory.abstracts.ingredients.Sauce;
import br.design.pattern.factory.abstracts.ingredients.SlicedPepperoni;
import br.design.pattern.factory.abstracts.ingredients.ThinCrustDough;
import br.design.pattern.factory.abstracts.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		final Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
