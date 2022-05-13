package br.decorator.padaria.v2.decorator;

import br.decorator.padaria.v2.component.VariedadePao;

public class Salame implements RecheioDecorator {

	private VariedadePao variedadePao;

	public Salame(final VariedadePao variedadePao) {
		this.variedadePao = variedadePao;
	}
	
	@Override
	public VariedadePao getVariedadePao() {
		return this.variedadePao;
	}

	@Override
	public String getDescricao() {
		return this.variedadePao.getDescricao() + ", Salame";
	}

	@Override
	public double getValor() {
		return this.variedadePao.getValor() + 4.5;
	}


}
