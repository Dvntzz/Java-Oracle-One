// contratro autenticavel
 //quem assina precisa concretizar
  // o metodo setSenha e autentica
public abstract interface Autenticavel{
	
		public abstract void setSenha(int senha);
		public abstract boolean autentica(int senha);
	}

