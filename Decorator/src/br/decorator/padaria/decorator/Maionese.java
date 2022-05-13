package br.decorator.padaria.decorator;

import br.decorator.padaria.component.Pao;

public class Maionese extends RecheioDecorator {
	
	public Maionese(final Pao pao) {
		super(pao);
	}
	
	@Override
	public String getDescricao() {
		return this.getPao().getDescricao() + ", Maionese";
	}

	@Override
	public double getValor() {
		return this.getPao().getValor() + 0.5;
	}

}
