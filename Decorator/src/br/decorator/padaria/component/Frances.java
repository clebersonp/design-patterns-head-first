package br.decorator.padaria.component;

public class Frances extends Pao {

	private String descricao;

	public Frances() {
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
