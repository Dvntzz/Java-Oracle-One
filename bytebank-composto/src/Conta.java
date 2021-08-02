
public class Conta{
		private double saldo;
		int agencia;
		int numero;
		Cliente titular;	
		
		//método depositar
		public void deposita(double valor) {
			this.saldo += valor;
			System.out.println("O valor de "+ valor +" depositado com sucesso");
		}
		
		
		//metódo sacar
		public boolean saca(double valor) {
			if(this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				System.out.println("Saque efetuado com sucesso");
				return true;
			}else {
				System.out.println("O saque não foi efetuado, verifique o saldo em sua conta");
				return false;
			}
		}
		
		
		//metódo transferir
		public boolean transfere(Conta destino,double valor) {
			if(this.saldo>=valor) {
				this.saca(valor);
				destino.deposita(valor);
				System.out.println("Valor de "+valor+" tranferido com sucesso.");
				return true;
			}else {
				System.out.println("Impossivel efetuar tranferencia, verefique o saldo de sua conta");
				return false;
			}
		}
		
		public double getSaldo(){
			return this.saldo;
		}

}
