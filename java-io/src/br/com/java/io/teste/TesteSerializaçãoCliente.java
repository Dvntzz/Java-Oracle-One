package br.com.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializaçãoCliente {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		
//		Cliente c1 = new Cliente();
//		c1.setNome("Felipe Dantas");
//		c1.setProfissao("Desenvolvedor");
//		c1.setCPF("11199967856");
	
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));	
//		oos.writeObject(c1);
//		oos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente c1 = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(c1.getNome()+", "+c1.getProfissao()+", "+c1.getCPF());
		
	}
}
