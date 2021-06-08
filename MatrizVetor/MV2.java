package MatrizVetor;

import java.util.Scanner;

public class MV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];
		int somapar=0, quantimpar=0,x; 
		
		Scanner ler = new Scanner(System.in); 
		
		for(x=0; x<num.length;x++);
		
		{
			System.out.println("\nDigite um número: ");
			num[x]=ler.nextInt();
			
			if(num[x]%2==0)
				
			{
				somapar+=num[x];
			}
			else 
			{
				quantimpar++;
			}
			for(x=0;x<num.length;x++); 
			{
				if(num[x]%2==0);
				{
			
			System.out.println("\n"+num[x]+" = Número par");
		}
				
				{
			
					System.out.println("\n"+num[x]+" = Número impar");
		          
				}
	           
			}
	        
			
			System.out.println("\nSomatório dos números pares: "+somapar);
	        System.out.println("\nQuantidade de números impares: "+quantimpar);
	          
	          
}

	}
	
}




