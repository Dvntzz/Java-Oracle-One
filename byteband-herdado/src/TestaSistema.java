
public class TestaSistema {
		public static void main(String[] args) {
			Autenticavel G = new Gerente();
			G.setSenha(20);
			SistemaInterno si = new SistemaInterno();
			si.autentica(G);
					
			Autenticavel  c = new Cliente();
			c.setSenha(10);
			si.autentica(c);
			
			Autenticavel f = new Fiscal();
			f.setSenha(30);
			si.autentica(f);
			
			Autenticavel a = new Administrador();
			a.setSenha(40);
			si.autentica(a);
			
			
			
		}
	}
