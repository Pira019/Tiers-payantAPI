package ania.projects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ania.projects.services.PersonService;

@RestController
public class PersonneController {
	
	@Autowired
	PersonService personService;
	
	
}
