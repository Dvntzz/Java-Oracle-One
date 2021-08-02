
public class TestaGeteSet {
	public static void main(String[] args) {
		Cliente Felipe = new Cliente();
		Felipe.setNome("Felipe");
			
		Conta conta = new Conta(1337,242226);
		conta.setNumero(4999);
		System.out.println(conta.getNumero());
		
		conta.setTitular(Felipe);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Faxineiro");
		System.out.println(conta.getTitular().getProfissao());		
				
		System.out.println("Testando metodo de total de contas: "+Conta.getTotal());
		
	}
}
