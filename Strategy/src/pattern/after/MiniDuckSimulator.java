package pattern.after;

import pattern.after.behavior.FlyRocketPowered;
import pattern.after.model.Duck;
import pattern.after.model.MallardDuck;
import pattern.after.model.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		System.out.println();
		
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
