package IntroduçãoAlgoritmo;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double idade, meses, dias, totaldias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a idade:");
        idade=leia.nextDouble();
        System.out.println("\nEntre com os meses:");
        meses=leia.nextDouble();
        System.out.println("\nEntre com os dias:");
        dias=leia.nextDouble();
        
        totaldias=idade*365+meses*+dias;
        
        System.out.println("\nTotal de dias:"+totaldias+"dias");
        
    
        
        
        		
        		
		
		
		

	}

}
