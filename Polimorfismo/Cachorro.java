package Poliformismo;

public class Cachorro extends Animal {
	
	public Cachorro()
	{
		super("Cachorro");
	}
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro(a): "+nomeAnimal);
	}

	
	@Override
	public void Idade1(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som1(String somAnimal)
	{
		System.out.println("\nSom que o cachorro emite: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nO cachorro possui a característica de correr.");
	}

	

	
}
