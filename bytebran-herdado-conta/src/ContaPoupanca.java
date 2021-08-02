
public class ContaPoupanca extends Conta {
	
	
	//chamando construtor da classe Conta
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		double valorASacar = (valor + 0.10);
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		System.out.println("O valor de "+ valor +" depositado com sucesso");
	}
}
