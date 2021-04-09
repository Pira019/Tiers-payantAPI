package ania.projects.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ania.projects.model.Medecin;
import ania.projects.service.MedecinService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 
@Configuration
 class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Autowired
	private MedecinService medecinService;
	
	@Bean
	CommandLineRunner initDataBase() {
		
		return args-> {
		medecinService.Save(new Medecin("tring nomMedecin", "String prenomMedecin", "String specialite", "String adresse", "String email",
					"String tel"));
		
		medecinService.Save(new Medecin("tring nomMedecin", "String prenomMedecin", "String specialite", "String adresse", "String email",
				"String tel"));
		
		medecinService.Save(new Medecin("tring nomMedecin", "String prenomMedecin", "String specialite", "String adresse", "String email",
				"String tel"));
			
			//medecinService.getALLMedecin().forEach(medecin -> log.info("Prelod" + medecin));
		};
	}
	public LoadDatabase() {
		// TODO Auto-generated constructor stub
	}

}
