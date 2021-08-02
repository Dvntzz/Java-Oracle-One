
public abstract class Conta{
		protected double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total;
		
		
		//diferente de um metodo ele n�o tem retorno e nem tipo de variavel
		//ele � uma rotina de inicializa��o
		public Conta(int agencia, int numero) {
			if(agencia < 1) {
	            throw new IllegalArgumentException("Agencia inv�lida");
	        }

	        if(numero < 1) {
	            throw new IllegalArgumentException("Numero da conta inv�lido");
	        }

			Conta.total++;
			System.out.println("Conta criada");
			System.out.println("J� foram criadas "+ Conta.total + " contas");;
			this.agencia = agencia;
			this.numero = numero;
		}
		
		
		
		
		//m�todo depositar
		public abstract void deposita(double valor);
		
		
		//met�do sacar
		public void saca(double valor) {
			if(this.saldo < valor) {
				throw new SaldoInsuficiente("Saldo de "+ this.saldo +" Insuficiente, saque n�o efetuado, lembre-se que"
						+ " existem tarifas para saque em contas correntes e poupan�as");
			}else {
				this.saldo = this.saldo - valor;
			}	
		}
		
		
		//met�do transferir
		public void transfere(Conta destino,double valor) {
			 this.saca(valor);
			 destino.deposita(valor);
		}
		
		public double getSaldo(){
			System.out.print("Saldo: ");
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
