package com.wissal.enseignants.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wissal.enseignants.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	

}
