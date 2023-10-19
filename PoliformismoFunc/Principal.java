package PoliformismoFunc;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(10, "Beatriz", "15 95643-4556", 3323, "rua dos bobos");
		System.out.println("SALARIO JORNADA:");
		System.out.println(jornada.calcularSalario(10, 20));
		
		Horista horista = new Horista(10, "Beatriz", "15 95643-4556", 3323, "rua dos bobos");
		System.out.println("SALARIO HORISTA:");
		System.out.println(horista.calcularSalario(20, 40));
		
		PessoaJuridica pessoa = new PessoaJuridica(10, "Beatriz", "15 95643-4556", 3323, "rua dos bobos");
		System.out.println("SALARIO PESSOA JURIDICA:");
		System.out.println(pessoa.calcularSalario(22020, 90));
	}	
}