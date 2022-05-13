package br.decorator.padaria.v2.component;

public class PaoBaguete implements VariedadePao {

	private String descricao;

	public PaoBaguete() {
		this.descricao = "Pão Baguete";
	}
	
	@Override
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public double getValor() {
		return 3.0;
	}

}
