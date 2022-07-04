package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.BonSR;
import com.sms2i.gestionIntervention.service.BonSRService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bonSR")
public class BonSRController extends GenericController<BonSR,Long, BonSRService> {
}
