package Poliformismo;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;

		int x;
		do
		{
			System.out.println("\nQual é o seu animal???\n\n1-Cachorro\n2-Cavalo\n3-Preguiça\n");
			
			x = leia.nextInt();
			
			
			if(x==1)
			{ 
				animal=cachorro;
				System.out.println("\nQual o nome do seu cachorro?");
				String nome = leia.next();
				
				System.out.println("\nQuantos anos seu cachorro tem?");
				int idade = leia.nextInt();
				
				System.out.println("\nEssa é legal!!!Qual o som que seu cachorro emite?");
				String som = leia.next();
				
				System.out.println("*-**-**-**-**-*");
				cachorro.Nome(nome);
				cachorro.Idade1(idade);
				cachorro.Som1(som);
				cachorro.Corre();
				
			}
			else if(x==2)
			{
				animal=cavalo;
				System.out.println("\nQual o nome do seu cavalo?");
				String nome = leia.next();
				
				System.out.println("\nQuantos anos seu cavalo tem?");
				int idade = leia.nextInt();
				
				System.out.println("\nEssa é legal!!!Qual o som que seu cavalo emite?");
				String som = leia.next();
				
				System.out.println("*-**-**-**-**-*");
				cavalo.Nome(nome);
				cavalo.Idade1(idade);
				cavalo.Som1(som);
				cavalo.Corre();
			}
				
				else if(x==3)
				{
					animal=preguica;
					System.out.println("\nQual o nome da sua preguiça?");
					String nome = leia.next();
					System.out.println("\nQuantos anos sua preguiça tem?");
					int idade = leia.nextInt();
					System.out.println("\nEssa é legal!!!Qual o som que sua preguiça emite?");
					String som = leia.next();
					System.out.println("*-**-**-**-**-*");
					preguica.Nome(nome);
					preguica.Idade1(idade);
					preguica.Som1(som);
					preguica.localizacao();
				}
				else
				{
					System.out.println("\nInformação Inválida!!!");
				}
			}
			while(x<=0 || x>=4);
			
		


			

		


	}

}
