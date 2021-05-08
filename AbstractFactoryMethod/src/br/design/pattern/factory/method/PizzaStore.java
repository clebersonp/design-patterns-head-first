package br.design.pattern.factory.method;

public abstract class PizzaStore {
	
	/*
	 * 
	 * Factory Method:
	 * Defines an interface for creating an object,
	 * but let subclasses decide which class to instantiate.
	 * Factory Method lets a class defer instantiation to the
	 * subclasses. Object creation is delegated to subclasses.
	 * 
	 */
	protected abstract Pizza createPizza(Pizza.Type type);

	public Pizza orderPizza(final Pizza.Type type) {
		Pizza pizza = this.createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
