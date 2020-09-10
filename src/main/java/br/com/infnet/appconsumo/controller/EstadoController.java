package br.com.infnet.appconsumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.infnet.appconsumo.model.service.EstadosService;

@Controller
public class EstadoController {
	@Autowired
	private EstadosService service;
	
	@RequestMapping(value = "/estados", method = RequestMethod.GET)
	public String showState(
			Model model
			) {
		model.addAttribute("estados",service.buscarEstados());
		return "estados";
	}
	
	@RequestMapping(value = "/municipios/{id}", method = RequestMethod.GET)
	public String showMunicip(
			Model model
			,@PathVariable Integer id
			) {
		model.addAttribute("municipios",service.buscarMunicipios(id));
		return "municipios";
	}

}
