package LaçoCondicional;

import java.util.Scanner; 

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int numero;
             double result;
             Scanner leia = new Scanner(System.in);
             
             System.out.println("\nEntre com o número: ");
             numero=leia.nextInt();
             
             if(numero % 2 == 0){
             result = Math.sqrt(numero);
            	 
             }
             
             else {
            	 result=Math.pow(numero, 2); 
            	 
             }
             
             System.out.println("\nNúmero: "+numero+"\nResultado: "+result);
             
             
		
		
	}

}
