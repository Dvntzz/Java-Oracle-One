
public class Conta{
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total;
		
		
		//diferente de um metodo ele não tem retorno e nem tipo de variavel
		//ele é uma rotina de inicialização
		public Conta(int agencia, int numero) {
			Conta.total++;
			System.out.println("Conta criada");
			System.out.println("Já foram criadas "+ Conta.total + " contas");;
			this.agencia = agencia;
			this.numero = numero;
		}
		
		
		
		
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
			System.out.println("Saldo");
			return this.saldo;
		}
		
		public int getNumero() {
			System.out.println("Numero da conta");
			return this.numero;
		}
		
		public void setNumero(int numero) {
			if(numero <=0) {
				System.out.println("O numero da conta precisa ser positivo!");
			}else {
				System.out.println("Ok! o numero da conta foi atualizado!");
				this.numero = numero;
			}
		}
		
		public int getAgencia() {
			System.out.println("Agencia");
			return this.agencia;
		}
		
	    public void setAgencia(int agencia) {
	    	if(agencia <= 0) {
	    		System.out.println("O numero da agencia precisa ser positivo!");
	    		return;
	    	}else {
	    		System.out.println("Ok! A agencia foi modificada");
	    		this.agencia = agencia;
	    	}
	    }
		
	    
	    public Cliente getTitular() {
			return titular;
		}

	    public void setTitular(Cliente titular) {
			this.titular = titular;
		}
	    
	    public static int getTotal() {
			return Conta.total;
		}
}
