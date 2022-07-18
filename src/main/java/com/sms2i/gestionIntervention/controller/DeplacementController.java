 package com.sms2i.gestionIntervention.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms2i.gestionIntervention.model.Deplacement;
import com.sms2i.gestionIntervention.service.DeplacementService;

@RestController
@RequestMapping("/Deplacement")
public class DeplacementController extends GenericController<Deplacement, Long, DeplacementService> {
   @Autowired
   DeplacementController(DeplacementService service) {
   super(service);
   }
}
 
