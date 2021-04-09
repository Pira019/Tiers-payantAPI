package ania.projects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ania.projects.model.Medecin;
import ania.projects.service.MedecinService;

@RestController
public class TestController {

	@Autowired
	private MedecinService medecinService;
	
	
	public TestController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/medecins")
	public List<Medecin> getAll() {
		return medecinService.getALLMedecin();
	}

}
