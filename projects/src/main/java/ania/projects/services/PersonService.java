package ania.projects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ania.projects.model.Person;
import ania.projects.repository.PersonRepo;
import ania.projects.services.interfaces.IPersonneService;

@Service
public class PersonService implements IPersonneService {

	@Autowired
	PersonRepo personRepo;
	
	@Override
	public void save(Person person) {
		
		personRepo.save(person);
	}
	
	

}
