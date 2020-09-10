package br.com.infnet.appconsumo.model.negocio;

public class Estados {
	private Integer id;
	private String sigla;
	private String nome;
	private Regiao regiao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s - %s", 
				this.id
				,this.nome
				,this.sigla
				,this.regiao
				);
	}
}
