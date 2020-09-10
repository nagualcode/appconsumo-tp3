package br.com.infnet.appconsumo.clients;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.appconsumo.model.negocio.Estados;
import br.com.infnet.appconsumo.model.negocio.Municipios;



@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades", name = "estadosClient")
public interface IEstadosClient {
	
	@GetMapping("/estados")
	public List<Estados> obterEstados();
	
	@GetMapping("/estados/{id}/municipios")
	public List<Municipios> obterMunicipiosEstado(@PathVariable Integer id);
}