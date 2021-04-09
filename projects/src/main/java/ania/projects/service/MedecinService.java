package ania.projects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ania.projects.model.Medecin;
import ania.projects.repository.Iterface.MedecinRepository;
import ania.projects.services.interfaces.IMedecinService;

@Service
public class MedecinService implements IMedecinService {

	@Autowired
	private MedecinRepository medecinRepository;
	
	
	public MedecinService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Save(Medecin medecin) {
		medecinRepository.save(medecin);
	}

	@Override
	public List<Medecin> getALLMedecin() {
		// TODO Auto-generated method stub
		return medecinRepository.findAll();
	}

}
