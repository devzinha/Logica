package ProjetoBloco1;

import java.util.Scanner;

public class Perfil {
	
	private String nome;
	private int idade;
	private String email;
	private String endereco;
	private int telefone;
	private String cpf;
	private String bandeira; 
	private String numeroCartao; 
	private String plano; 
	private String login;
	private String senha;
	
	public Perfil(String nome, int idade, String email, String end, int tel, String cpf, String band, String nc, String plano, String login, String senha)
	
	{
		setNome(nome);
		setIdade(idade);
		setEmail(email);
		setEndereco(end);
		setTelefone(tel);
		setCpf(cpf);
		setBandeira(band);
		setNumeroCartao(nc);
		setPlano(plano);
		setLogin(login);
		setSenha(senha);
		
	}
	
	
	public void alterarSenha() {
		System.out.println("\nDigite a senha antiga: ");
	
		Scanner read = new Scanner (System.in);
		String aux = read.nextLine();
		
		if(aux.equals(this.senha)) {
			
		System.out.println("\nDigite a nova senha: ");
		
		}
		
		 aux = read.nextLine();
		 
		 aux = senha;
		 
		}
	
	public void alterarEmail() {
		System.out.println("\nDigite a senha: ");
	
		Scanner read = new Scanner (System.in);
		String aux = read.nextLine();
		
		if(aux.equals(this.senha)) {
			
		System.out.println("\nDigite o nova Email: ");
		
		}
		
		 aux = read.nextLine();
		 
		 aux = email;
		 
		}
	
	public void escolhaPlano()
	{

		System.out.println("Selecione o tipo de plano: (1-Individual | 2-Casal | 3-Fam�lia)");
		
		Scanner leia = new Scanner(System.in);
		
		int x = leia.nextInt();
		
	    

		if(x < 0 || x > 3){
		     while(x < 0 || x > 3){
		         
		    	 System.out.println("Plano inv�lido! Digite novamente.");
		         x = leia.nextInt();
		         
		         
		     }
		}
	

		if(x == 1 ) {
			
			System.out.println("Plano Individual selecionado!");
		}
		
		if(x == 2 ) {
		
			System.out.println("Plano Casal selecionado!");
		}
		
		if(x == 3 ) {
			System.out.println("Plano Fam�lia selecionado!");
		}
	
	}
	
	public void alterarPlano() {
		System.out.println("\nDigite a senha: ");
	
		Scanner read = new Scanner (System.in);
		String aux = read.nextLine();
		
		if(aux.equals(this.senha)) {
			
			System.out.println("Escolha o novo plano: (1-Individual | 2-Casal | 3-Fam�lia)");
		
		}
		
         aux = read.nextLine();
		 
		 aux = plano;
		
		}
	
	
	public void validarDados() {
		
		if(getCpf().length()!=11)
        {
            System.out.println("\n--CPF Inv�lido--");
        }
        else
        {
            System.out.println("\n--CPF V�lido--");
        }
	
	
     
		if(getIdade() < 14 ) 
		{
		
	
			System.out.println("\n--PERFIL CLASSIFICADO COMO INFANTIL-- ");
	 
		}
		
		else 
		{
			System.out.println("\n--PERFIL CLASSIFICADO COMO ADULTO-- ");
		}
	
		if(getNumeroCartao().length()!=16)
        {
            System.out.println("\n--N�mero de cart�o Inv�lido--");
        }
        else
        {
            System.out.println("\n--N�mero de cart�o V�lido--");
        }
	
		
		
	}

	
	public void apresentarDados() {
		
		System.out.println("\nNome: "+nome+"\nIdade: "+idade+"\nEmail: "+email+"\nEndere�o: "+endereco+"\nTelefone: "+telefone+
				"\nCPF: "+cpf+"\nBandeira do Cart�o: "+bandeira+"\nN�mero do Cart�o: "+numeroCartao+"\nPlano: "+plano);
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
		
}


	


