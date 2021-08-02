
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(1000);
		
		
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(2000);

		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cc.saca(100);
		System.out.println(cc.getSaldo());
		
		cp.saca(100);
		System.out.println(cp.getSaldo());
	}

}
