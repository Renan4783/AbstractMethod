package br.unicentro.acaddecomp;

public class FabricaNordica implements FabricaDePersonagem{

	@Override
	public Heroi criaHeroi() {
		return new Beowulf();
	}

	@Override
	public Monstro criaMonstro() {
		return new Troll();
	}



}
