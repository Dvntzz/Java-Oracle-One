
public class Fiscal implements Autenticavel {

	private Autentication aut;
	
	public Fiscal() {
		this.aut = new Autentication();
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
