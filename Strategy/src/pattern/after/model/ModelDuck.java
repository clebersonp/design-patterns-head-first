package pattern.after.model;

import pattern.after.behavior.FlyNoWay;
import pattern.after.behavior.Quack;

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
