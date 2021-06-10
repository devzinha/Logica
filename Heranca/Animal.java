package Heranca;

public class Animal {
	
	public String nome;
	public int idade;
	
	public Animal(String nome, int idade2)
	{
		super();
		this.nome = nome;
		this.idade = idade2; 
	
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
