package br.design.pattern.factory.abstracts;

import br.design.pattern.factory.abstracts.ingredients.BlackOlives;
import br.design.pattern.factory.abstracts.ingredients.Cheese;
import br.design.pattern.factory.abstracts.ingredients.Clams;
import br.design.pattern.factory.abstracts.ingredients.Dough;
import br.design.pattern.factory.abstracts.ingredients.Eggplant;
import br.design.pattern.factory.abstracts.ingredients.FrozenClams;
import br.design.pattern.factory.abstracts.ingredients.MozzarellaCheese;
import br.design.pattern.factory.abstracts.ingredients.Pepperoni;
import br.design.pattern.factory.abstracts.ingredients.PlumTomatoSauce;
import br.design.pattern.factory.abstracts.ingredients.Sauce;
import br.design.pattern.factory.abstracts.ingredients.SlicedPepperoni;
import br.design.pattern.factory.abstracts.ingredients.Spinach;
import br.design.pattern.factory.abstracts.ingredients.ThickCrustDough;
import br.design.pattern.factory.abstracts.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		final Veggies[] veggies = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
