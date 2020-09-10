
package br.com.infnet.appconsumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.appconsumo.model.service.EnderecoService;

@Controller
public class CepController {
	
	@Autowired
	private EnderecoService service;
	

	@RequestMapping(value = "/cep", method = RequestMethod.POST)
	public String retornaCep(
			Model model,
			@RequestParam String qualcep
			) {
		
		model.addAttribute("endereco", service.obterPorCep(qualcep));
		return "cep";
	}
	

}
