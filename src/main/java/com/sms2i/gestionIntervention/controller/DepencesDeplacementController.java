package com.sms2i.gestionIntervention.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms2i.gestionIntervention.model.DepencesDeplacement;
import com.sms2i.gestionIntervention.model.Deplacement;
import com.sms2i.gestionIntervention.service.DepencesDeplacementService;



@RestController
@RequestMapping("/DepencesDeplacement")

public class DepencesDeplacementController {
	
	@Autowired
	private DepencesDeplacementService depencesDeplacementService;
	
	@PostMapping("/add")
	
	DepencesDeplacement add(@RequestBody DepencesDeplacement d) {
	return depencesDeplacementService.addDepencesDeplacement(d);
		
	}
	
	@GetMapping("/getAll")
	public List<DepencesDeplacement> getAll() {
	List<DepencesDeplacement> list = depencesDeplacementService.getAll();
	return list;
	}
	
	@PostMapping("")
	@ResponseBody
	public DepencesDeplacement addDepencesDeplacement(@RequestBody DepencesDeplacement dp){
		return depencesDeplacementService.addDepencesDeplacement(dp);
	}

	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

