package pattern.before;

import pattern.before.model.Duck;
import pattern.before.model.MallardDuck;
import pattern.before.model.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		/*
		 * 
		 * A principio OK. Mas se a classe não deveria implementar algum método é por que temos um problema
		 * de conceitos. Sem contar que em runtime não conseguimos trocar de comportamento os métodos
		 * fly() e quack().
		 * Se nem todo Duck fly ou quack, então seria melhor separar o que pode variar e encapsula-lo do resto
		 * que permanece o mesmo. Esse é um dos Design Principle.
		 * Sem contar que, para cada Duck que não pode fly ou quack, deveremos repetir o código na classe
		 * que implementará a classe pai Duck.
		 * 
		 */
		
		Duck model = new ModelDuck();
		model.fly();
		model.quack();

		System.out.println();

		Duck mallard = new MallardDuck();
		mallard.fly();
		mallard.quack();

		System.out.println();
	}

}
