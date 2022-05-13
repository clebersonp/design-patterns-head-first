package br.decorator.padaria.component;

public class Baguete extends Pao {

	private String descricao;

	public Baguete() {
		this.descricao = "Baguete";
	}
	
	@Override
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public double getValor() {
		return 3.5;
	}

}
