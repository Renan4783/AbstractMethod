package br.unicentro.acaddecomp;

public class FabricaGrega implements FabricaDePersonagem{

	@Override
	public Heroi criaHeroi() {
		return new Hercules();
	}

	@Override
	public Monstro criaMonstro() {
		return new Minotauro();
	}

}
