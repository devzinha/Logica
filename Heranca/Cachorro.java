package Heranca;

public class Cachorro extends Animal {
	
	String porte; 
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public String getPorte() {
		return porte;
	}
	
	public void setPorte(String porte) {
        this.porte = porte;
	}
	public void printInfo(){
		System.out.println("\nNome: \"+nome+\"\\nIdade: \"+idade+\"\nPorte do cachorro:  \"+porte");
		
	}
	
}
