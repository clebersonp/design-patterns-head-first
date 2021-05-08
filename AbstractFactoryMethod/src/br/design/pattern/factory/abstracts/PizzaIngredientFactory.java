package br.design.pattern.factory.abstracts;

import br.design.pattern.factory.abstracts.ingredients.Cheese;
import br.design.pattern.factory.abstracts.ingredients.Clams;
import br.design.pattern.factory.abstracts.ingredients.Dough;
import br.design.pattern.factory.abstracts.ingredients.Pepperoni;
import br.design.pattern.factory.abstracts.ingredients.Sauce;
import br.design.pattern.factory.abstracts.ingredients.Veggies;

/*
 * 
 * Abstract Factory:
 * Provides an interface for creating families of
 * related or dependent objects without specifying
 * their concrete classes, without having to depend
 * on their concrete classes.
 * 
 * Object creation is implemented in methods exposed in
 * the factory interface
 * 
 */
public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
