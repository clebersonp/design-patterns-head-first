package pattern.before.model;

public abstract class Duck {

	public Duck() {
	}

	abstract void display();

	public abstract void quack();

	public abstract void fly();

	public void swim() {
		System.out.println("Duck is swimming...");
	}
}
