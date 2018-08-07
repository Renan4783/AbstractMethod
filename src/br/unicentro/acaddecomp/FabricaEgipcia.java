package br.unicentro.acaddecomp;

public class FabricaEgipcia implements FabricaDePersonagem{

	@Override
	public Heroi criaHeroi() {
		return new Farao();
	}

	@Override
	public Monstro criaMonstro() {
		return new Anubis();
	}

}
