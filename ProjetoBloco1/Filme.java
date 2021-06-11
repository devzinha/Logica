package ProjetoBloco1;

import java.util.Scanner;

public abstract  class Filme {
	
	private String nome;
	private String categoria; 
	private int duracao; 
	private String classificacaoIndicativa; 
	private int momento;  
	protected String descricao;
	private int nota;
	private int contaNota;
	
Scanner read = new Scanner(System.in);
	
	public Filme(String nome, String categoria, int duracao, String classificacaoIndicativa, 
			int momento, String descricao)
	
	{
		setNome(nome);
		setCategoria(categoria);
		setDuracao(duracao);
		setClassificacaoIndicativa(classificacaoIndicativa);
		setMomento(momento);
		setDescricao(descricao);
		nota=0;
		contaNota=0;
	}
	
	abstract public void mensagemInicio();
	
	abstract public void efeitoVisual();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getContaNota() {
		return contaNota;
	}

	public void setContaNota(int contaNota) {
		this.contaNota = contaNota;
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
	
}
