package br.pattern.model;

import br.pattern.behavior.FlyBehavior;
import br.pattern.behavior.QuackBehavior;

public abstract class Duck {
	
	// os behaviors sao composition de Duck
	// favor composition over inheritance;
	// program to interface, not implementation;
	// Encapsulate what varies;
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;

	public Duck() {
	}

	abstract void display();
	
	// Strategy pattern
	// quackBehavior e flyBehavior sao um conjunto de comportamento
	// e encapsulam cada um dos seus comportamentos
	// sao chamados tbm por "familia de algoritmos"
	public void performQuack() {
		this.quackBehavior.quack();
	}

	public void performFly() {
		this.flyBehavior.fly();
	}

	public void swim() {
		System.out.println("Duck is swimming...");
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
