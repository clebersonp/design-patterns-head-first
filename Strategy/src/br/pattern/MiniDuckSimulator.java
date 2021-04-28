package br.pattern;

import br.pattern.behavior.FlyRocketPowered;
import br.pattern.model.Duck;
import br.pattern.model.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		/*
		 * 
		 * Strategy - defines a family of algorithms(FlyBehavior e QuackBehavior),
		 * encapsulates each one, and makes them interchangeable. Strateguy lets the
		 * algorithm vary independently from clients that use it.
		 * 
		 */

		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		System.out.println();

		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFly();

	}

}
