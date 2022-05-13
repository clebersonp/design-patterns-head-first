package br.decorator.padaria.decorator;

import br.decorator.padaria.component.Pao;

public abstract class RecheioDecorator extends Pao {
	
	private Pao pao;
	
	public RecheioDecorator(final Pao pao) {
		this.pao = pao;
	}

	public Pao getPao() {
		return this.pao;
	}
	
	// poderia ter outros metodos
	
}
