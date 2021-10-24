package com.wissal.enseignants.service;

import java.util.List;

import com.wissal.enseignants.entities.Enseignant;

public interface EnseignantService {
	
	Enseignant saveEnseignant(Enseignant e);
	Enseignant updateEnseignant(Enseignant e);
	void deleteEnseignant(Enseignant e);
	void deleteEnseignantById(Long id);
	Enseignant getEnseignant(Long id);
	List<Enseignant> getAllEnseignants();
}
