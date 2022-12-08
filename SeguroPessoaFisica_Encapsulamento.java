package seguros;

import contas.Conta; //Importação do Pacotes contas e da Classe Conta. (Link)

public class SeguroPessoaFisica extends Conta { //adicionar "extends Conta" em caso de Protected 

		public static void main(String[] args) {
				
		//Utilizar objeto SeguroPessoaFisica herança (extends classe Conta)
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Maxim Vengerov");
		cc3.setSaldo(500);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		
		/*//Atributos e Métodos Publicos
		Conta cc3 = new Conta();
		cc3.cliente = "Maxim Vengerov";
		cc3.saldo = 500;
		System.out.println("Cliente: " + cc3.cliente);
		cc3.exibirSaldo();  */

	}

}
