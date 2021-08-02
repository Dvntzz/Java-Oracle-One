//gerente � um funcionario, uma extens�o ou ele herda tudo que um funcionario tem
public class Gerente extends Funcionario implements Autenticavel{
	private Autentication aut;
	
	//construtor padrao do gerente
	public Gerente() {
		this.aut = new Autentication();
	}
	
	//metodo bonifica��o
	public double getBonificacao() {
		System.out.print("Gerente: ");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.aut.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.aut.autentica(senha);
	}
}

	