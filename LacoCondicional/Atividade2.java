package LaçoCondicional;

import java.util.Scanner;

public class Atividade2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num1, num2, num3;
         Scanner leia = new Scanner(System.in);
         
         
         System.out.println("\nEscreva o primeiro número: ");
         num1=leia.nextInt();
         System.out.println("\nEscreva o segundo número: ");
         num2=leia.nextInt();
         System.out.println("\nEscreva o terceiro número: ");
         num3=leia.nextInt();
         
         if(num1<=num2 && num2<=num3){
         System.out.println(num1+","+num2+" e "+num3);
         }
         
         else if(num1<=num3 && num3<=num2)
 		{
 			System.out.println(num1+","+num2+" e "+num3);
 		}
 		else if(num2<=num1 && num1<=num3)
 		{
 			System.out.println(num2+","+num1+" e "+num3);
 		}
 		else if(num2<=num3 && num3<=num1)
 		{
 			System.out.println(num2+","+num3+" e "+num1);
 		}
 		else if(num3<=num1 && num1<=num2)
 		{
 			System.out.println(num3+","+num1+" e "+num2);
 		}
 		else
 		{
 			System.out.println(num3+","+num2+" e "+num1);

 		
	}
    
	}
	
}
	
            
             
             
             
             
             

