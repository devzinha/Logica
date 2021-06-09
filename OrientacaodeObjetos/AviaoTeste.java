package OrientaçãodeObjetos;

public class AviaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao aviao1 = new Aviao("11FEX45", "Generation Airlines", "13:00", "Buenos Aires");
		
		aviao1.imprimirInfo();
		
		System.out.println("\nVOO AGENDADO COM SUCESSO. ");
		aviao1.setCompanhiaArea("Generation Airlines. ");
		
		System.out.println("\nTENHA UMA BOA VIAGEM!");
		

	}

}
