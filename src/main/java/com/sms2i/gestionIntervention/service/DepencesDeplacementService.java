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
	private DepencesDeplacementRepository repository ;

	public List<DepencesDeplacement> getAll() {
		return   repository.findAll();
	}
	public DepencesDeplacement add(DepencesDeplacement dp ) {
		Deplacement d = new Deplacement();
		d.setId(dp.getId().getIdDeplacement());
		CategorieDepences c = new CategorieDepences();
		c.setId(dp.getId().getIdCategorieDepences());
		dp.setCategorieDepences(c);
		dp.setDeplacement(d);
		return repository.save(dp);
	}

	public List<DepencesDeplacement> getAllbyDeplacementId(long deplacementId){
		Deplacement deplacement = new Deplacement();
		deplacement.setId(deplacementId);
		return repository.findAllByDeplacement(deplacement);
	}


	

	


}
