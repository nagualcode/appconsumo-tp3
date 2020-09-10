package br.com.infnet.appconsumo.model.service;

import br.com.infnet.appconsumo.clients.IEstadosClient;
import br.com.infnet.appconsumo.model.negocio.Estados;
import br.com.infnet.appconsumo.model.negocio.Municipios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EstadosService {

	@Autowired
	private IEstadosClient client;
	
	public List<Estados> buscarEstados() {
		return client.obterEstados();
	}
	
	public List<Municipios> buscarMunicipios(Integer id) {
		return client.obterMunicipiosEstado(id);
	}
}
