package br.decorator.padaria.v2.component;

public class PaoFrances implements VariedadePao {

	private String descricao;

	public PaoFrances() {
		this.descricao = "Pão Frances";
	}
	
	@Override
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public double getValor() {
		return 1.0;
	}

}
