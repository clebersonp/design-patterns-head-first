package br.decorator.padaria.decorator;

import br.decorator.padaria.component.Pao;

public class Salame extends RecheioDecorator {
	
	public Salame(final Pao pao) {
		super(pao);
	}
	
	@Override
	public String getDescricao() {
		return this.getPao().getDescricao() + ", Salame";
	}

	@Override
	public double getValor() {
		return this.getPao().getValor() + 5.5;
	}

}
