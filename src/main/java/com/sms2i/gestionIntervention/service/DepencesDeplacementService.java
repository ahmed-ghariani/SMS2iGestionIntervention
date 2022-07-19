package com.sms2i.gestionIntervention.service;

import java.util.List;

import com.sms2i.gestionIntervention.id.DepencesDeplacementId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sms2i.gestionIntervention.model.CategorieDepences;
import com.sms2i.gestionIntervention.model.DepencesDeplacement;
import com.sms2i.gestionIntervention.model.Deplacement;
import com.sms2i.gestionIntervention.repository.DepencesDeplacementRepository;
import com.sms2i.gestionIntervention.repository.DeplacementRepository;
import org.springframework.web.server.ResponseStatusException;


@Service
public class DepencesDeplacementService  {
	
	@Autowired
	private DepencesDeplacementRepository repository ;

	public List<DepencesDeplacement> getAll() {
		return   repository.findAll();
	}
	public DepencesDeplacement add(DepencesDeplacement dp ) {
		dp.setId(new DepencesDeplacementId(dp.getDeplacement().getId(),dp.getCategorieDepences().getId()));
		return repository.save(dp);
	}

	public List<DepencesDeplacement> getAllbyDeplacementId(long deplacementId){
		Deplacement deplacement = new Deplacement();
		deplacement.setId(deplacementId);
		return repository.findAllByDeplacement(deplacement);
	}


	public DepencesDeplacement getById(DepencesDeplacementId id) {
		return repository.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"no element with id: "+id+" found")
		);
	}

    public DepencesDeplacement update(DepencesDeplacementId id, DepencesDeplacement depencesDeplacement) {
		Deplacement deplacement = new Deplacement();
		deplacement.setId(id.getDeplacementId());
		CategorieDepences categorieDepences = new CategorieDepences();
		categorieDepences.setId(id.getCategorieDepencesId());
		depencesDeplacement.setDeplacement(deplacement);
		depencesDeplacement.setCategorieDepences(categorieDepences);
		depencesDeplacement.setId(id);
		return repository.save(depencesDeplacement);
    }
}
