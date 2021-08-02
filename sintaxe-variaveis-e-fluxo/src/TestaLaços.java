
public class TestaLaços {
	public static void main(String[] args) {
		
		for(int i = 1; i<=10;i++) {
			System.out.println("Tabuada do " + i);
			for(int contador = 0; contador<=10;contador++) {
				System.out.println(i+"x"+contador+"="+i*contador);
				System.out.print(" ");
			}
			System.out.println();
		}  
	}
}
