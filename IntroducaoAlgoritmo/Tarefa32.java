package IntroduçãoAlgoritmo;

import java.util.Scanner;

public class Tarefa32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double horas, minutos, segundos, ts;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o total de segundos do evento:");
		ts = leia.nextDouble();
		
		horas=ts/3600;
		minutos=(ts%3600/60);
		segundos=(ts%3600)%60;
		
		System.out.println("\nHoras:"+horas+ "Minutos:"+minutos+ "Segundos:"+segundos);
		

	}

}
