//gerente � um funcionario, uma extens�o ou ele herda tudo que um funcionario tem
public class EditorVideo extends Funcionario {
	
	public EditorVideo() {
		System.out.println(" Editor de Video criado com sucesso!");
	}
	
	//metodo bonifica��o
	public double getBonificacao() {
		System.out.print("Editor: ");
		return 100;
	}
	
}

	