package desafio_dio_banco;

public abstract class Conta implements IConta 
{
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private Double saldo = 0.0;
	private Cliente cliente;
	
	public Conta(Cliente cliente)
	{
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(Double valor)
	{
		this.saldo -= valor;
	}

	@Override
	public void depositar(Double valor)
	{
		this.saldo += valor;
	}

	@Override
	public void transferir(Double valor, Conta contaDestino)
	{
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia()
	{
		return agencia;
	}

	public int getNumero()
	{
		return numero;
	}

	public Double getSaldo()
	{
		return saldo;
	}
	
	public void imprimirInfosComuns()
	{
		System.out.println(String.format("Agencia: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
