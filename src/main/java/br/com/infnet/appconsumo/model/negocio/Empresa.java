

package br.com.infnet.appconsumo.model.negocio;

public class Empresa {
	
	  private String cnpj;
	  private String cep;
	  private String logradouro;
	  private String numero;
	  private String bairro;
	  private String municipio;
	  private String porte;
	  
	  @Override
	  public String toString() {
		  return this.cnpj;
		//  return String.format(
		//		  "%s %s, %s, %s - %s - %s", 
		//		  this.getLogradouro(),
		//		  this.getComplemento(),
		//		  this.getBairro(),
		//		  this.getLocalidade(),
		//		  this.getUf(),
		//		  this.getCep()
		//		  );
	  }
	  
	 
	  
	  

	  
	  
	  
	  
	  public String getCnpj() {
		return cnpj;
	}









	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}









	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public String getMunicipio() {
		return municipio;
	}




	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}




	public String getPorte() {
		return porte;
	}




	public void setPorte(String porte) {
		this.porte = porte;
	}




	public String getCep() {
		return cep;
	}

	  
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	


}
