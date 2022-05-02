package pattern.before.model;

public class ModelDuck extends Duck {

	@Override
	public void display() {
		System.out.println("ModelDuck displaying...");
	}

	@Override
	public void quack() {
		System.out.println("ModelDuck not quacking...");
	}

	@Override
	public void fly() {
		System.out.println("ModelDuck not flying...");
	}

}
