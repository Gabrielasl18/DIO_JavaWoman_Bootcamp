package BancoDigital;

public class Conta implements Iconta {
	

	private static final int AGENCIA_PADRAO = 0001;
	
	private static int SEQUENCIAL = 1;//valor sequencial sendo controlado pela propria classe
	
	protected int agencia; //o protected serve para usar o SUPER. em outra classe
	protected int numConta;
	protected double saldo =  0d;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO; // nao precisa mais do super.agencia
		this.numConta = SEQUENCIAL++;
	
	}
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	} 
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInfosComuns() {
		System.out.println("Agencia: === " + this.agencia);
		System.out.println("Numero === " + this.numConta);
		System.out.println("Saldo === " + this.saldo);
	}

}
