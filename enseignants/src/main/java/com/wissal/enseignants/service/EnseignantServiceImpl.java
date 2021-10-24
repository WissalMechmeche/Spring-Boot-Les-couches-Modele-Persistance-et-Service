package com.wissal.enseignants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissal.enseignants.entities.Enseignant;
import com.wissal.enseignants.repos.EnseignantRepository;

@Service
public class EnseignantServiceImpl implements EnseignantService {
	@Autowired
	EnseignantRepository enseignantRepository;
	@Override
	public Enseignant saveEnseignant(Enseignant e) {
	return enseignantRepository.save(e);
	}
	@Override
	public Enseignant updateEnseignant(Enseignant e) {
	return enseignantRepository.save(e);
	}
	@Override
	public void deleteEnseignant(Enseignant e) {
	enseignantRepository.delete(e);
	}
	 @Override
	public void deleteEnseignantById(Long id) {
	enseignantRepository.deleteById(id);
	}
	@Override
	public Enseignant getEnseignant(Long id) {
	return enseignantRepository.findById(id).get();
	}
	@Override
	public List<Enseignant> getAllEnseignants() {
	return enseignantRepository.findAll();
	}


}
