
public class ContaCorrente extends Conta implements Tributavel{
	
	
	//chamando construtor da classe Conta
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override  //= (sobrescrita)
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		System.out.println("O valor de "+ valor +" depositado com sucesso");
		
	}
	
	@Override
	public double getValorImposto() {
		return 1;
	}
	
}
