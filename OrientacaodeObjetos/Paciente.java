package OrientaçãodeObjetos;

public class Paciente {
	
	private String nomePaciente; 
	private String idade; 
	private String queixa; 
	private String convenio; 
	
	public Paciente(String nomePaciente, String idade, String queixa, String convenio)
	{
		this.nomePaciente = nomePaciente; 
		this.idade = idade; 
		this.queixa = queixa;
		this.convenio = convenio;
	}
	 public Paciente(String nomePaciente, String queixa)
	 {
		 this.nomePaciente = nomePaciente;
		 this.queixa = queixa; 
	 }
	 public void imprimirInfo()
	 {
		 System.out.println("A paciente "+nomePaciente+" de "+idade+" de idade,"+" conveniada pela "+convenio+", queixa-se de "+queixa);
				
	
	 }
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getQueixa() {
		return queixa;
	}
	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	

}
