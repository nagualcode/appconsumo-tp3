package br.com.infnet.appconsumo.model.negocio;

public class Microrregiao {
	private Integer id;
	private String nome;
	private Mesorregiao mesorregiao;
	
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
	public Mesorregiao getMesorregiao() {
		return mesorregiao;
	}
	public void setMesorregiao(Mesorregiao mesorregiao) {
		this.mesorregiao = mesorregiao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s", 
				this.id
				,this.nome
				,this.mesorregiao
				);
	}
}
