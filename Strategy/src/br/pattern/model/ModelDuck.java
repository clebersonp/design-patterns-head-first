package br.pattern.model;

import br.pattern.behavior.FlyNoWay;
import br.pattern.behavior.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyNoWay());
	}

	@Override
	void display() {
		System.out.println("ModelDuck displaying...");
	}

}
