
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaFelipe = new Conta();
		contaFelipe.saldo+= 300;
		System.out.println("Saldo atual(20:32): "+contaFelipe.saldo);
		contaFelipe.deposita(50);
		System.out.println("Saldo atual(20:33): "+contaFelipe.saldo);
		
		
		contaFelipe.saca(400);
		System.out.println("Saldo atual(20:49): "+contaFelipe.saldo);
		
	}
	
}
