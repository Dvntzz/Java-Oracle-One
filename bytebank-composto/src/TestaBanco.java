
public class TestaBanco {
	
	public static void main(String[] args) {	
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(100);
		
		contaDoFelipe.titular = new Cliente();
		contaDoFelipe.titular.nome = "Felipe Dantas do Nascimento";
		contaDoFelipe.titular.CPF = "438.798.567-90";
		contaDoFelipe.titular.profissao = "Programador";
		
		System.out.println("  ");
		System.out.println("Nome: "+contaDoFelipe.titular.nome);
		System.out.println("Saldo: "+contaDoFelipe.getSaldo());
	}
}
