
public class TesteConex�o {

	public static void main(String[] args) {	
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();		
//		}catch(IllegalStateException ex) {
//			System.out.println("Perda de conex�o");
//		}finally {
//			if(con != null) {
//				con.fecha();
//			}
//		}
		
		//FORMA SIMPLES
		
		try (Conexao con = new Conexao()){
			con.leDados();		
		}catch(IllegalStateException ex){
			System.out.println("Erro de conex�o");
		}
		
			
		

		}
	}