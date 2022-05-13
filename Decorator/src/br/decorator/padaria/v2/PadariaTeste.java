package br.decorator.padaria.v2;

import br.decorator.padaria.v2.component.PaoBaguete;
import br.decorator.padaria.v2.component.PaoFrances;
import br.decorator.padaria.v2.component.VariedadePao;
import br.decorator.padaria.v2.decorator.Maionese;
import br.decorator.padaria.v2.decorator.QueijoPrato;
import br.decorator.padaria.v2.decorator.Salame;

public class PadariaTeste {
	public static void main(String[] args) {
		
		VariedadePao paoFrances = new PaoFrances();
		paoFrances = new Salame(new QueijoPrato(new Maionese(paoFrances)));
		System.out.println(paoFrances.getDescricao() + ", R$ " + paoFrances.getValor());
		
		VariedadePao paoBaguete = new PaoBaguete();
		paoBaguete = new Maionese(new Salame(paoBaguete));
		System.out.println(paoBaguete.getDescricao() + ", R$ " + paoBaguete.getValor());
	}
}
