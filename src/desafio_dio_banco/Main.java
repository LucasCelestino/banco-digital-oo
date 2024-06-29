package desafio_dio_banco;

public class Main {

	public static void main(String[] args)
	{
		Cliente c1 = new Cliente();
		c1.setNome("Lucas");
		
		Cliente c2 = new Cliente();
		c2.setNome("Fulano");
		
		ContaCorrente cc = new ContaCorrente(c1);
		ContaCorrente cp = new ContaCorrente(c2);
		
		cc.depositar(250.5);
		
		cc.sacar(53.7);
		
		cc.transferir(72.3, cp);
		
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();
	}

}
