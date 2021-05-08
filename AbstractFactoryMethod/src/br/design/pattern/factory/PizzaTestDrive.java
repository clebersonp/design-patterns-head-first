package br.design.pattern.factory;

import br.design.pattern.factory.method.ChicagoPizzaStore;
import br.design.pattern.factory.method.NYPizzaStore;
import br.design.pattern.factory.method.Pizza;
import br.design.pattern.factory.method.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		final PizzaStore nyStore = new NYPizzaStore();
		final PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza(Pizza.Type.CHEESE);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(Pizza.Type.CHEESE);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(Pizza.Type.CLAM);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(Pizza.Type.CLAM);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(Pizza.Type.PEPPERONI);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(Pizza.Type.PEPPERONI);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(Pizza.Type.VEGGIE);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(Pizza.Type.VEGGIE);
		System.out.println("Joel ordered a " + pizza + "\n");
	}

}
