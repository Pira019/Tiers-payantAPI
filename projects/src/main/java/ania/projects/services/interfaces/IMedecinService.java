package ania.projects.services.interfaces;

import java.util.List;

import ania.projects.model.Medecin;

public interface IMedecinService {

	void Save(Medecin medecin);
	List<Medecin> getALLMedecin();
}
