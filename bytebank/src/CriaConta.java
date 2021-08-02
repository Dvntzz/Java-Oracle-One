
public class CriaConta {
	public static void main(String[] args) {
		
		//isso � um objeto criado a partir de uma estancia��o de uma classe
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 50;
		primeiraConta.titular = "Felipe Dantas do Nascimento";
		primeiraConta.agencia = 3019;
		primeiraConta.numero = 128976538-58;
		System.out.println("Titular: "+primeiraConta.titular);
		System.out.println("Saldo: "+primeiraConta.saldo);
		System.out.println("Ag�ncia: "+primeiraConta.agencia);
		System.out.println("Numero: "+primeiraConta.numero);
		
		int deposito = 50;
		primeiraConta.saldo += deposito;
		System.out.println("Recebido deposito valor: "+deposito);
		System.out.println("Saldo ap�s deposito: "+primeiraConta.saldo);
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("    ");
		
		//isso � outro objeto criado a partir da estancia��o da mesma classe do anterior
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		segundaConta.titular = "Maria Jos� da Costa Dantas";
		segundaConta.agencia = 3021;
		segundaConta.numero = 128934348-90;
		System.out.println("Titular: "+segundaConta.titular);
		System.out.println("Saldo: "+segundaConta.saldo);
		System.out.println("Ag�ncia: "+segundaConta.agencia);
		System.out.println("Numero: "+segundaConta.numero);
	
		segundaConta.saldo += deposito;
		System.out.println("Recebido deposito valor:"+deposito);
		System.out.println("Saldo ap�s deposito: "+segundaConta.saldo);
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("    ");

		
		/*
		//usando operador == (igual, igual) para comparar o objeto
		if(primeiraConta.saldo==segundaConta.saldo) {
			System.out.println("S�o iguais");
		}else {
			System.out.println("N�o s�o iguais");
		}
		 */
		
		/*
		//usando operado ==(igual,igual) para comparar a referencia
		if(primeiraConta==segundaConta) {
			System.out.println("S�o sim iguais");
		}else {
			System.out.println("N�o, N�o s�o iguais");
		}*/
		

		
		segundaConta.transfere(primeiraConta, 50);
		System.out.println("saldo primeira conta: "+primeiraConta.saldo);
		System.out.println("saldo segunda conta: "+segundaConta.saldo);
			
		
		
		
		
	}
}
