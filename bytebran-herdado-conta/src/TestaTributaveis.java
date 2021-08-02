
public class TestaTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222,333);
		cc.deposita(2000);
		
		SeguroDeVida sv = new SeguroDeVida();
		CalculaImposto ci = new CalculaImposto();

		ci.registra(cc);
		ci.registra(sv);
		
		 System.out.println(ci.getTotalImposto());
		
		
		
		
	}

}
