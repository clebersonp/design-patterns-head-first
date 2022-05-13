package br.decorator.padaria.decorator;

import br.decorator.padaria.component.Pao;

public class Calabresa extends RecheioDecorator {
	
	public Calabresa(final Pao pao) {
		super(pao);
	}
	
	@Override
	public String getDescricao() {
		return this.getPao().getDescricao() + ", Calabresa";
	}

	@Override
	public double getValor() {
		return this.getPao().getValor() + 1.5;
	}

}
