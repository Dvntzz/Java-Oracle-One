
public abstract class Funcionario {
	protected String nome;
	private String CPF;
	protected double salario;
	
	//construtor padrao modificado
	public Funcionario() {
	}
	
	
	//metodo bonificação
	public abstract double getBonificacao();
	 
	//Metodos nome
	public String getNome() {
		System.out.print("Nome: ");
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	//Metodos CPF
	public String getCPF() {
		System.out.print("CPF: ");
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	//Metodos salario
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

	