package pattern.before.model;

public class MallardDuck extends Duck {

	@Override
	void display() {
		System.out.println("MallardDuck displaying...");
	}

	@Override
	public void quack() {
		System.out.println("MallardDuck quacking...");
	}

	@Override
	public void fly() {
		System.out.println("MallardDuck flying...");
	}

}
