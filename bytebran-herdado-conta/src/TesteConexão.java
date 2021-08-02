
public class TesteConexão {

	public static void main(String[] args) {	
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();		
//		}catch(IllegalStateException ex) {
//			System.out.println("Perda de conexão");
//		}finally {
//			if(con != null) {
//				con.fecha();
//			}
//		}
		
		//FORMA SIMPLES
		
		try (Conexao con = new Conexao()){
			con.leDados();		
		}catch(IllegalStateException ex){
			System.out.println("Erro de conexão");
		}
		
			
		

		}
	}