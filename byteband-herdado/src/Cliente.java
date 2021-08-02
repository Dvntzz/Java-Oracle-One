
public class Cliente implements Autenticavel {
	private Autentication aut;
	
	public Cliente() {
		this.aut = new Autentication();
	}
	
	//reutilizando codigo
	@Override
	public void setSenha(int senha) {
		this.aut.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.aut.autentica(senha);
		
	} 
}
