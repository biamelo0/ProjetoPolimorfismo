package PolimorfismoComputador;

public class Gamer implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("Ligando o computador gamer");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando o computador gamer");
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligando o computador gamer");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("Carregando sistema do computador gamer");
	}

}
