
public class Administrador extends Funcionario implements Autenticavel {
	private Autentication aut;
	
	//construtor padrao do gerente
	public Administrador() {
		this.aut = new Autentication();
	}
	
	
	@Override
	public double getBonificacao() {
		return 100;
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
 