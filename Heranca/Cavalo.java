package Heranca;

public class Cavalo extends Animal {
		
		int velocidadeMaxima;
		public Cavalo(String nome, int idade) {
		super(nome, idade);
	
	}
	
	public int getvelocidadeMaxima() {
		return velocidadeMaxima;
		
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void printInfo(){
        System.out.printf("Nome: "+nome+"\nIdade: "+idade+"\nVelocidade máxima que o animal corre:  "+velocidadeMaxima);
        
        
	}

}

