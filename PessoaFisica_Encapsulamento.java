package contas;

public class PessoaFisica { 	

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Winicios Jardim");
		cc1.setSaldo(2000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();

		System.out.println("------------------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Doguinho Jardim");
		cc2.setSaldo(2000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();

	}

}


//Classe PessoaFisica é publica. 
	//Acessível a qualquer método, atributos e Classes do mesmo pacote