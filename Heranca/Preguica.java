package Heranca;

import Heranca.Animal;

public class Preguica extends Animal{
	
	String localizacao; 
	    public Preguica(String nome, int idade) {
		super(nome, idade); 
	}
	public String getlocalizacao() {
		return localizacao;
	}
		
		public void setLocalizacao(String localizacao){
	        this.localizacao = localizacao;
		}
	        
	        public void printInfo(){
	    		System.out.println("\nNome: "+nome+"\nIdade: "+idade+"\nContinente que esse animal se localiza: ");
	
	}

}
