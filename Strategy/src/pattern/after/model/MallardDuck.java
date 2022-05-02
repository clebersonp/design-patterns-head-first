package pattern.after.model;

import pattern.after.behavior.FlyWithWings;
import pattern.after.behavior.Quack;

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
