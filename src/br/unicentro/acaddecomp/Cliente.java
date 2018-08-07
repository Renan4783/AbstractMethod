package br.unicentro.acaddecomp;

public class Cliente {
	public static void main(String[] args) {
	
		FabricaDePersonagem fabricaegipcia = new FabricaEgipcia();
		FabricaDePersonagem fabricanordica = new FabricaNordica();
		FabricaDePersonagem fabricagrega = new FabricaGrega();
		
		Heroi heroiGrego = fabricagrega.criaHeroi();
		System.out.println(heroiGrego);
		
		Heroi heroiEgipcio = fabricaegipcia.criaHeroi();
		System.out.println(heroiEgipcio);
		
		Heroi heroiNordico = fabricanordica.criaHeroi();
		System.out.println(heroiNordico);
		
		Monstro monstroGrego = fabricagrega.criaMonstro();
		System.out.println(monstroGrego);
		
		Monstro monstroEgipcio = fabricaegipcia.criaMonstro();
		System.out.println(monstroEgipcio);
		
		Monstro monstroNordico = fabricanordica.criaMonstro();
		System.out.println(monstroNordico);
	}
}
