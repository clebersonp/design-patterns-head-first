package br.design.pattern.factory.method;

import br.design.pattern.factory.abstracts.ingredients.Cheese;
import br.design.pattern.factory.abstracts.ingredients.Clams;
import br.design.pattern.factory.abstracts.ingredients.Dough;
import br.design.pattern.factory.abstracts.ingredients.Pepperoni;
import br.design.pattern.factory.abstracts.ingredients.Sauce;
import br.design.pattern.factory.abstracts.ingredients.Veggies;

public abstract class Pizza {

	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggies veggies[];
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clam;

	protected Pizza(String name) {
		this.name = name;
	}

	protected abstract void prepare();

	protected void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	protected void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	protected void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected Dough getDough() {
		return dough;
	}

	protected void setDough(Dough dough) {
		this.dough = dough;
	}

	protected Sauce getSauce() {
		return sauce;
	}

	protected void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	protected Veggies[] getVeggies() {
		return veggies;
	}

	protected void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	protected Cheese getCheese() {
		return cheese;
	}

	protected void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	protected Pepperoni getPepperoni() {
		return pepperoni;
	}

	protected void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	protected Clams getClam() {
		return clam;
	}

	protected void setClam(Clams clam) {
		this.clam = clam;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + this.name + " ----\n");
		if (this.dough != null) {
			result.append("Dough: ").append(this.dough);
			result.append("\n");
		}
		if (this.sauce != null) {
			result.append("Sauce: ").append(this.sauce);
			result.append("\n");
		}
		if (this.cheese != null) {
			result.append("Cheese: ").append(this.cheese);
			result.append("\n");
		}
		if (this.veggies != null) {
			result.append("Veggies: ");
			for (int i = 0; i < this.veggies.length; i++) {
				result.append(this.veggies[i]);
				if (i < this.veggies.length - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (this.clam != null) {
			result.append("Clam: ").append(this.clam);
			result.append("\n");
		}
		if (this.pepperoni != null) {
			result.append("Pepperoni: ").append(this.pepperoni);
			result.append("\n");
		}
		return result.toString();
	}

	public enum Type {
		CHEESE, CLAM, PEPPERONI, VEGGIE
	};

}
