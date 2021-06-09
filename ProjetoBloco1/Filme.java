package ProjetoBloco1;

import java.util.Scanner;

public class Filme {
	
	private String nome;
	private String categoria; 
	private int duracao; 
	private String classificacaoIndicativa; 
	private int momento;  
	private String descricao;
	
	public Filme(String nome, String categoria, int duracao, String classificacaoIndicativa, int momento, String descricao)
	
	{
		setNome(nome);
		setCategoria(categoria);
		setDuracao(duracao);
		setClassificacaoIndicativa(classificacaoIndicativa);
		setMomento(momento);
		setDescricao(descricao);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public int getMomento() {
		return momento;
	}

	public void setMomento(int momento) {
		this.momento = momento;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void apresentarInfo()
	   
	{
        System.out.println("Filme: "+nome+"\nCategoria: "+categoria+"\nDuração: "+duracao
                +"\nClassificação indicativa: "+classificacaoIndicativa+"\n -----Descrição-----\n"+descricao);
        
	}
	
	/*
	public lista Favoritar(Usuario x) 
	{
		x.addFilme;
		return lista; 
        
     }
	*/
	
	
	public void rodar()
	{
		System.out.println("Selecione o idioma: (1-PT | 2-EN | 3-ES)");
		
		Scanner leia = new Scanner(System.in);
		
		int x = leia.nextInt();
		
	    

		if(x < 0 || x > 3){
		     while(x < 0 || x > 3){
		         System.out.println("Idioma inválido! Digite novamente.");
		         x = leia.nextInt();
		     }
		}

		
		System.out.println("Gostaria de uma legenda? (1-PT | 2-EN | 3-ES | 4-Sem legenda)" );
		
		int y = leia.nextInt();
		
		if(y < 0 || y > 4){
		     while(y < 0 || y > 4){
		         System.out.println("Opção inválida! Digite novamente.");
		         y = leia.nextInt();
		     }
		}
		
		if(x == 1 ) {
			
			System.out.println("Bom filme! ");
		}
		
		if(x == 2 ) {
		
			System.out.println("Have a nice movie! ");
		}
		
		if(x == 3 ) {
			System.out.println("Buena película! ");
		}
	
		
	}
	
  
	public void parar()
	{
		System.out.println("Ficaremos com saudades... ");
	}
	
	public void pausar()
	{
		System.out.println("Estamos te esperando! ");
	}

}
