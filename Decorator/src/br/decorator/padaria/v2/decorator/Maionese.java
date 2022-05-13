package br.decorator.padaria.v2.decorator;

import br.decorator.padaria.v2.component.VariedadePao;

public class Maionese implements RecheioDecorator {

	private VariedadePao variedadePao;

	public Maionese(final VariedadePao variedadePao) {
		this.variedadePao = variedadePao;
	}
	
	@Override
	public VariedadePao getVariedadePao() {
		return this.variedadePao;
	}

	@Override
	public String getDescricao() {
		return this.variedadePao.getDescricao() + ", Maionese";
	}

	@Override
	public double getValor() {
		return this.variedadePao.getValor() + 2.3;
	}


}
