
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo=300;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		segundaConta.saldo += 100.0;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		//usando operador == (igual, igual) para comparar o objeto
		if(primeiraConta.saldo==segundaConta.saldo) {
			System.out.println("S�o iguais");
		}else {
			System.out.println("N�o s�o iguais");
		}
				
		//usando operado ==(igual,igual) para comparar a referencia
		if(primeiraConta==segundaConta) {
			System.out.println("As contas s�o igual, a referencia��o possibilita"
			+ "acessar o mesmo objeto de duas formas distintas");
		}else {
			System.out.println("N�o, N�o s�o iguais");
		}
				
		
		
		
	}
}
