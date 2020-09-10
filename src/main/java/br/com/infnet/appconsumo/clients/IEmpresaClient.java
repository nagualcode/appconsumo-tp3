

package br.com.infnet.appconsumo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.appconsumo.model.negocio.Empresa;



@FeignClient(url = "https://www.receitaws.com.br/v1", name = "empresaClient")

public interface IEmpresaClient {
	
	
	@GetMapping("/cnpj/{cnpj}")
	public Empresa obterPorCnpj(@PathVariable String cnpj);
	

}


