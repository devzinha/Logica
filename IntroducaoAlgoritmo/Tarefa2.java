package IntroduçãoAlgoritmo;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A:");
		a = leia.nextDouble();
		System.out.println("\nEntre com o valor de B:");
		b = leia.nextDouble();
		System.out.println("\nEntre com o valor de C:");
		c = leia.nextDouble();
		System.out.println("\nEntre com o valor de D:");
		d = leia.nextDouble();
		System.out.println("\nEntre com o valor de E:");
		e = leia.nextDouble();
		System.out.println("\nEntre com o valor de F:");
		f = leia.nextDouble();
		
		x= (c*e-b*f)/(a*e-b*d);
		y= (a*f-c*a)/(a*e-b*d);
		
		System.out.println("\nValor de X: "+x);
		System.out.println("\nValor de Y:"+y); 
		
	}

}
