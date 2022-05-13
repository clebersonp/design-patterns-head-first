package br.decorator.padaria.v2.decorator;

import br.decorator.padaria.v2.component.VariedadePao;

public interface RecheioDecorator extends VariedadePao {

	VariedadePao getVariedadePao();

}
