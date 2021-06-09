package OrientaçãodeObjetos;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Cliente cliente1 = new Cliente("Maria Eduarda Pinheiro", " 19 anos", "44992", " Iphone Pro Max", "R$7000");
           
           
           cliente1.imprimirInfo();
           
           System.out.println("\n***COMPRA REALIZADA COM SUCESSO***");
           cliente1.setNomeCliente("Maria Eduarda Pinheiro");
 
           
           
           
	}

}
