package PolimorfismoComputador;

public class Home implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("Ligando o computador home");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando o computador home");
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligando o computador home");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("Carregando sistema do computador home");
	}

}
