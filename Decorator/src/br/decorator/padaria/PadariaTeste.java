package br.decorator.padaria;

import br.decorator.padaria.component.Baguete;
import br.decorator.padaria.component.Frances;
import br.decorator.padaria.component.Pao;
import br.decorator.padaria.decorator.Calabresa;
import br.decorator.padaria.decorator.Maionese;
import br.decorator.padaria.decorator.Salame;

public class PadariaTeste {

	public static void main(String[] args) {
		
		Pao paoFrances = new Frances();
		System.out.println(paoFrances.getDescricao() + ", R$ " + paoFrances.getValor());
		
		paoFrances = new Salame(paoFrances);
		paoFrances = new Calabresa(paoFrances);
		paoFrances = new Maionese(paoFrances);
		paoFrances = new Maionese(paoFrances);
		System.out.println(paoFrances.getDescricao() + ", R$ " + paoFrances.getValor());
		
		Pao baguete = new Calabresa(new Baguete());
		System.out.println(baguete.getDescricao() + ", R$ " + baguete.getValor());
	}
	
}
