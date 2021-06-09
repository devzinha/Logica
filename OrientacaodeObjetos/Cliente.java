package OrientaçãodeObjetos;

public class Cliente {
	
	private String nomeCliente; 
	private String idade; 
	private String cpf; 
	private String compra; 
	private String valor; 
	

	public Cliente(String nomeCliente, String idade, String cpf, String compra, String valor ) 
	{
		this.nomeCliente = nomeCliente;
		this.idade=idade;
		this.cpf=cpf;
		this.compra=compra;
		this.valor=valor;
	}
	public Cliente(String nomeCliente, String valor)
	{
		this.nomeCliente=nomeCliente;
		this.valor=valor; 
	}
	public void imprimirInfo()
	{
		System.out.println("O/A cliente " +nomeCliente+", de" +idade+", CPF: "+cpf+ ", fez a compra de um" +compra+ ", no valor de: R$ "+valor);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCompra() {
		return compra;
	}
	public void setCompra(String compra) {
		this.compra = compra;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
		
				
	}


