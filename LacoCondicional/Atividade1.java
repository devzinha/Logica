package LaçoCondicional;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, nummaior=0; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		num3 = leia.nextInt();
		
		if (num1>nummaior){
		nummaior=num1;
		if (num2>nummaior){
			nummaior=num2;
		if (num3>nummaior){
		    nummaior=num3;
				
			}
			
		}
		
		}
		
		System.out.println("\nO maior número é: "+ nummaior);
		
		
		}
		

	
}

		
	