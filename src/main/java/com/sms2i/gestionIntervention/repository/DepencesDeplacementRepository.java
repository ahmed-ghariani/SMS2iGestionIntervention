package com.sms2i.gestionIntervention.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms2i.gestionIntervention.model.DepencesDeplacement;
import com.sms2i.gestionIntervention.model.categorieDepencesDeplacement;

@Repository
public interface DepencesDeplacementRepository extends JpaRepository<DepencesDeplacement, categorieDepencesDeplacement> {
	
	public DepencesDeplacement DepencesDeplacementById(categorieDepencesDeplacement id);
	public List<DepencesDeplacement> getAll();
	public DepencesDeplacement addDepencesDeplacement (DepencesDeplacement d ) ;
	public DepencesDeplacement updateDepencesDeplacement(DepencesDeplacement d , categorieDepencesDeplacement id );
	public void deleteDepencesDeplacement(categorieDepencesDeplacement id); 


}
