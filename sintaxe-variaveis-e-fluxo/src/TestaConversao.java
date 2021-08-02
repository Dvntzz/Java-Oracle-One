
public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 1250.70;
		System.out.println("Meu salário é: "+ salario);
		
		//f no final para definir que o numero é um float
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		//casting (converter um double para inteiro)
		int valor = (int)salario;
		System.out.println("Meu salário é: "+ valor);
		
		//grande tipo primitivo
		long numeroGrande = 999999999999999999l;
		System.out.println("o maximo do tipo de dado long é: "+numeroGrande);
		//curto tipo primitivo
		short numeroPequeno = 2131;
		System.out.println("short "+numeroPequeno);
		//pequeno tipo primitivo
		byte b = 127;
		System.out.println("byte "+b);
		
		//valor que sair bugado
		double valor1 = 0.2;
		double valor2 = 0.1;
		System.out.println(valor1+valor2);
	}
}
