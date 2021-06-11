package Poliformismo;

public abstract class Animal {
	
	public String tipoAnimal;
	
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade1(int idadeAnimal);
	abstract public void Som1(String somAnimal);

	public Animal(String tipoAnimal)

	{
		super();
		this.tipoAnimal = tipoAnimal;
		
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	

	
}
