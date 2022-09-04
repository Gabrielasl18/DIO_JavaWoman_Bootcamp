package BancoDigital;

public class BancoFuncionando {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
	
		Conta poupanca = new ContaPoupanca();
		cc.transferir(100, poupanca);
		
		
		cc.imprimirInfosComuns();
		poupanca.imprimirInfosComuns();
	}
}
