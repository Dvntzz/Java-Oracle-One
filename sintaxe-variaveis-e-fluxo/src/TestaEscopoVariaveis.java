
import java.util.Scanner;
public class TestaEscopoVariaveis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("voc� est� acompanhado de quantas pessoa?");
		int acompanhante = sc.nextInt();
		boolean acompanhado;
		
			if(acompanhante >= 1 ) {
				acompanhado = true;
			}else {
				acompanhado = false;
			}
		
		
		if(idade >= 18 ||  acompanhado == true ) {
			System.out.println("voc� pode entrar");
		}else{
			System.out.println("voc� n�o pode entrar");
		}
		
		
		sc.close();
	}
}