package Poliformismo;

public class Cavalo extends Animal {
	public Cavalo()
	{
		super("Cavalo");
	}
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}

    @Override
	public void Idade1(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}

    @Override
	public void Som1(String somAnimal)
	{
		System.out.println("\nSom que o cavalo emite: "+somAnimal);
	}
	
    public void Corre()
	{
		System.out.println("\nO cavalo possui a característica de correr.");
	}

}

