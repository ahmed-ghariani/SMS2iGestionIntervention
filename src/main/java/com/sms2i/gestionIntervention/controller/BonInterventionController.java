package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.BonIntervention;
import com.sms2i.gestionIntervention.service.BonInterventionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bonIntervention")
public class BonInterventionController extends GenericController<BonIntervention,Long, BonInterventionService> {

}
