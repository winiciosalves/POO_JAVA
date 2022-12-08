package contas;

public class Conta {
	// Atributos e Metodos Cliente;
	private String cliente;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	// Atributos e Metodos Saldo;
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Construtor (Manter public)
	public Conta() {
		System.out.println("Agência: 0261");

	}

	// Alterar Métodos para: default, public, private e protected(SeguroPessoaFisica
	// extends Conta)
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);

	}

}

//Atributos Protected
//protected String cliente;
//protected double saldo;

/*
 * //Atributos default String cliente; double saldo;
 */

/*
 * // Atributos Public public String cliente; public double saldo;
 */

// SuperClasse ou Classe Base para outras classes
/*
 * Modificadores: Default: Permite acesso na própria Classe e também a membros
 * de Classes do mesmo Pacote).
 * 
 * Public : Permite acesso a todas as classes, Metodos e Atributos de todos os
 * Pacotes)
 * 
 * Private: Só permite acessos aos membros (atributos e métodos) da própria
 * classe (As Classes PessoaFisica e SeguroPessoaFisica) não terão acesso.
 * 
 * Protected: Permite acesso a própria classe, classes de outros pacotes ou se
 * tiver herança (Nesse exercício Somente terá acesso: SeguroPessoaFisica)
 * 
 */