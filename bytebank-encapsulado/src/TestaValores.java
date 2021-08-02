
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(9980,232323232);
		
		// a conta está inconsistente
		conta.setAgencia(-90);
		System.out.println(conta.getAgencia());
	}
}
