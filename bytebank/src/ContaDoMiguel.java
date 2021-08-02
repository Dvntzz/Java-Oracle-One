
public class ContaDoMiguel {
	public static void main(String[] args) {
		Conta contaMichell = new Conta();
		contaMichell.saldo = 2;
		contaMichell.agencia = 8756;
		contaMichell.titular = "Michell Pereira dos Santos";
		contaMichell.numero = 13379;
		
		System.out.println("Titular: "+contaMichell.titular);
		System.out.println("Saldo: "+contaMichell.saldo);
		System.out.println("Numero: "+contaMichell.numero);
		System.out.println("Agência: "+contaMichell.agencia);
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		
		contaMichell.deposita(2000);
		System.out.println("Saldo da sua conta é: "+contaMichell.saldo);
		contaMichell.saca(1);
		System.out.println("Saldo atual da sua conta é: "+contaMichell.saldo);
		
	}
}
