package com.sms2i.gestionIntervention.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms2i.gestionIntervention.model.DepencesDeplacement;
import com.sms2i.gestionIntervention.repository.DepencesDeplacementRepository;



@Service
public class DepencesDeplacementService  {
	
	@Autowired
	
	private DepencesDeplacementRepository depencesDeplacementRepository ; 



	
	/* public DepencesDeplacement DepencesDeplacementById(Long id) {
		
		
		return depencesDeplacementRepository.findById(id).get();

		
	}
	*/

	
	public List<DepencesDeplacement> getAll() {
		
		

		return   depencesDeplacementRepository.findAll();

		
		
	}

	
	public DepencesDeplacement addDepencesDeplacement(DepencesDeplacement d) {
		
		
		return  depencesDeplacementRepository.save(d) ; 

	}

	
	/* public DepencesDeplacement updateDepencesDeplacement(DepencesDeplacement d, Long id) {
		
		DepencesDeplacement deps = depencesDeplacementRepository.findById(id).get();
				
		
		return depencesDeplacementRepository.save(d);

		
		
	}
	
	

	
	public void deleteDepencesDeplacement(Long id) {
		
		depencesDeplacementRepository.deleteById(id);

		
		
		
	}
	
	*/


}
