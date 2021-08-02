
public class testeCaracteres {
	public static void main(String[] args) {
		//O tipo de dado char, guarda apenas uma letra
		char letra = 'A';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		//int cabe no char, mas char nao cabe no inteiro
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String frase = "Felipinho foi ao mercado em ";
		System.out.println(frase);
		
		//concatenação normal, o 2020(int) vai se tornar String
		frase = frase + 2020;
		System.out.println(frase);
	}
}
