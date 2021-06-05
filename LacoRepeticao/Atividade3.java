package LacoRepeticao;

import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ler = new Scanner(System.in);
     
     int idade=0, menos21=0, mais50=0;
     
     while(idade !=99){
    	 
    	 System.out.println("\nInsira a idade: ");
    	 idade=ler.nextInt();
    	 
    	 if(idade<21){
    		 
    		 menos21++;
    	 }
    	 
    	 else if(idade>50){
    		 mais50++;
    	 }
    	 System.out.println("\nForam inseridos "+menos21+" idades de 21 e "+mais50+" maiores que 50");
    	 }
     }
	}


