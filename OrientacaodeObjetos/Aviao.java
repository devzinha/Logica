package OrientaçãodeObjetos;

public class Aviao {
	
	private String voo;
	private String companhiaArea;
	private String horario; 
	private String destino; 
	
	public Aviao(String voo, String companhiaArea, String horario, String destino )
	{
	 this.voo = voo;
	 this.companhiaArea = companhiaArea; 
	 this.horario = horario; 
	 this.destino = destino; 
	 
	}
	public Aviao(String companhiaArea, String destino)
	{
		this.companhiaArea = companhiaArea;
		this.destino = destino;
	}
	public void imprimirInfo()
	{
		System.out.println("Voo: "+voo+"\nCom a companhia aréa "+companhiaArea+ ", com destino a "+destino+ ", partindo ás "+horario+" horas.");
		
		
}
	public String getVoo() {
		return voo;
	}
	public void setVoo(String voo) {
		this.voo = voo;
	}
	public String getCompanhiaArea() {
		return companhiaArea;
	}
	public void setCompanhiaArea(String companhiaArea) {
		this.companhiaArea = companhiaArea;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	}
