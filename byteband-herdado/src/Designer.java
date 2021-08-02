
public class Designer extends Funcionario {

	
	public Designer() {
		System.out.println(" designer criado com sucesso!!");
	}
	
	@Override
	public double getBonificacao() {
		System.out.print("Designer: ");
		return 100;
	}

}
