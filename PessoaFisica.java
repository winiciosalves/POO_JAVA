package contas;

public class PessoaFisica { 
	//Classe PessoaFisica é publica. Acessível a qualquer método, atributos e Classes do mesmo pacote

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.cliente = "Winicios Jardim";
		cc1.saldo = 2000;
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();

		System.out.println("------------------------------");
		Conta cc2 = new Conta();
		cc2.cliente = "Caio Silva";
		cc2.saldo = 1000;
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo();

	}

}
