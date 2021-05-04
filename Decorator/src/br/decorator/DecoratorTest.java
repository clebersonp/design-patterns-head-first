package br.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import br.decorator.component.Beverage;
import br.decorator.component.Beverage.Size;
import br.decorator.component.concrete.DarkRoast;
import br.decorator.component.concrete.Expresso;
import br.decorator.component.concrete.HouseBlend;
import br.decorator.condiments.concrete.Mocha;
import br.decorator.condiments.concrete.Soy;
import br.decorator.condiments.concrete.Whip;

/*
 * 
 * Principle:
 * Classes should be open for extension but closed for modification
 * 
 * 
 * Decorator:
 * Attach additional responsabilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * 
 * 
 * Java I/O API utiliza muito o Decorator:
 * 
 * BufferedReader e InputStreamReader eh o Decorator e InputStream eh o Component
 * cada instancia tem um comportamento:
 * FileInputStream convert o arquivo em stream de byte
 * InputStreamReader convert stream de byte para caracteres
 * BufferedReader possui comportamento de ler os caracters do stream de caracteres, ou ler as linhas do arquivo
 * Ex: BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt"))); 
 * 
 * 
 */

public class DecoratorTest {

	public static void main(String[] args) throws IOException {

		Beverage beverage = new Expresso();
		beverage.setSize(Size.VENTI);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(Size.VENTI);
		beverage2 = new Mocha(beverage2);
		beverage2.setSize(Size.VENTI);
		beverage2 = new Mocha(beverage2);
		beverage2.setSize(Size.VENTI);
		beverage2 = new Whip(beverage2);
		beverage2.setSize(Size.VENTI);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

		System.out.println("\nUsando Decorator IO API\n");
		try (BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));) {
			read.lines().forEach(System.out::println);
		}

	}

}
