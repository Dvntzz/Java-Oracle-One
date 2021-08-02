
public class TesteSaca {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.0);
		try {
			c.saca(200.0);
		}catch(SaldoInsuficiente ex) {
			System.out.println("Motivo: "+ex.getMessage());
		}
		System.out.println(c.getSaldo());
	}
	
}
