package Poliformismo;

public class Preguica extends Animal{
	
	public Preguica()
	{
		super("Preguiça");
	}

	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguiça: "+nomeAnimal);
	}
	
	@Override
	public void Idade1(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som1(String somAnimal)
	{
		System.out.println("\nSom que a sua preguiça emite: "+somAnimal);
	}
	
	public void localizacao()
	{
		System.out.println("\nUma das características da preguiça é ser encontrada na América Central e do Sul.");
	}



}
