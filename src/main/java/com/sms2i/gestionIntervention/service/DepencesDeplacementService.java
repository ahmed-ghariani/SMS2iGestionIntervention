package com.sms2i.gestionIntervention.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms2i.gestionIntervention.model.CategorieDepences;
import com.sms2i.gestionIntervention.model.DepencesDeplacement;
import com.sms2i.gestionIntervention.model.Deplacement;
import com.sms2i.gestionIntervention.repository.DepencesDeplacementRepository;
import com.sms2i.gestionIntervention.repository.DeplacementRepository;



@Service
public class DepencesDeplacementService  {
	
	@Autowired
	
	private DepencesDeplacementRepository depencesDeplacementRepository ; 
	private DeplacementRepository deplacementRepository ; 



	

	
	public List<DepencesDeplacement> getAll() {
		
		

		return   depencesDeplacementRepository.findAll();
		

		
		
	}

	
	
	public DepencesDeplacement addDepencesDeplacement(DepencesDeplacement dp ) {
		
		
		Deplacement d = new Deplacement();
		d.setId(dp.getId().getIdDeplacement());
		CategorieDepences c = new CategorieDepences();
		c.setId(dp.getId().getIdCategorieDepences());
		
		dp.setCategorieDepences(c);
		dp.setDeplacement(d);

		
		return depencesDeplacementRepository.save(dp);

		
	}
	

	


}
