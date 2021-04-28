package br.pattern.model;

import br.pattern.behavior.FlyWithWings;
import br.pattern.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}

	@Override
	void display() {
		System.out.println("MallardDuck displaying...");
	}

}
