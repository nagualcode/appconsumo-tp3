

package br.com.infnet.appconsumo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appconsumo.clients.IEmpresaClient;
import br.com.infnet.appconsumo.model.negocio.Empresa;

@Service
public class EmpresaService {
	
	@Autowired private IEmpresaClient client;
	
	public Empresa obterPorCnpj(String cnpj) {
		
		System.out.println(client.obterPorCnpj(cnpj));
		return client.obterPorCnpj(cnpj);
		
	}

}
