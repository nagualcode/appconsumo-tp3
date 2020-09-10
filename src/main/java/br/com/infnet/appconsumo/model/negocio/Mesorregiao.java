package br.com.infnet.appconsumo.model.negocio;

public class Mesorregiao {
	private Integer id;
	private String nome;
	private Estados estados;
	
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
	public Estados getEstados() {
		return estados;
	}
	public void setEstados(Estados estados) {
		this.estados = estados;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s", 
				this.id
				,this.nome
				,this.estados
				);
	}
}
