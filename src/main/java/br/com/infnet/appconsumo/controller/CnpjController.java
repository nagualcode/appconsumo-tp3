
package br.com.infnet.appconsumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.appconsumo.model.service.EmpresaService;

@Controller
public class CnpjController {
	
	@Autowired
	private EmpresaService service;
	

	@RequestMapping(value = "/cnpj", method = RequestMethod.POST)
	public String retornaCnpj(
			Model model,
			@RequestParam String qualcnpj
			) {
		
		model.addAttribute("empresa", service.obterPorCnpj(qualcnpj));
		return "cnpj";
	}
	
	
}
