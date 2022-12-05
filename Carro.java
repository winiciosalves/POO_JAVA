package poo;

import java.util.Random;

public class Carro {

	int ano;
	String cor;

	public Carro() { //Construtor sem parâmetro de inicialização.
		Random gerador = new Random(); // Classe importada da biblioteca Util
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}

	public Carro(int ano, String cor) { //Construtor inicializando objetos com parâmetros
		this.ano = ano;
		this.cor = cor;
		//Desenhando carro kkkk
		System.out.println("        ________");
		System.out.println("        /     /    \\");
		System.out.println(" ______/_____/______\\");
		System.out.println("[0[\\\\[0[___  | -   ___|"); 
		System.out.println("\\_____|/, \\|____|/, \\/");
		System.out.println("  \\\\_ \\\\__/     \\\\__/");
		System.out.println("______________________________");
	}
	void ligar() {

		System.out.println("engine ON .....");
	}

	void desligar() {

		System.out.println("engine OFF .....");
	}

	void acelerar() {

		System.out.println("VRUMMMM .....");
	}

}
